package translators;
import translator.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Translator extends StanBaseListener {
    private Object curBlock;
    private String dataCode = "";
    private String modelCode = "";
    private String testfile;
    private String datafile;
    private DataReader dataReader;
    private Map<String, Object> parameter = new HashMap<>(); // [0] dim, [1] limit, [2] type
    private Map<String, Object> datablkData = new HashMap<>();
    private ArrayList<String> modelData = new ArrayList<>();


    public Translator(String testfile, String data){
        this.testfile = testfile;
        this.datafile = data;

        //data
        DataParser parser = readDataFile(this.datafile);
        ParseTreeWalker walker = new ParseTreeWalker();
        dataReader = new DataReader();
        walker.walk(dataReader, parser.datafile());

        StanParser stanParser = readStanFile(testfile);
        ParseTreeWalker stanWalker = new ParseTreeWalker();
        stanWalker.walk(this, stanParser.program());
    }

    public static DataParser readDataFile(String path){
        CharStream stream = null;
        try {
            stream = CharStreams.fromFileName(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        DataLexer dataLexer = new DataLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(dataLexer);
        DataParser dataParser = new DataParser(tokens);
        return dataParser;
    }

    public static StanParser readStanFile(String path){
        CharStream stream = null;
        try {
            stream = CharStreams.fromFileName(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        StanLexer stanLexer = new StanLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(stanLexer);
        StanParser stanParser = new StanParser(tokens);
        return stanParser;
    }


    @Override
    public void enterDecl(StanParser.DeclContext ctx) {
        if(curBlock == StanParser.DatablkContext.class){
            if(ctx.type().PRIMITIVE() != null){
                if (ctx.type().PRIMITIVE().getText().equalsIgnoreCase("INT")){
                    dataCode += ctx.ID().getText();
                    if (this.dataReader.getData(ctx.ID().getText()) != null)
                        dataCode += " : " + this.dataReader.getData(ctx.ID().getText());
                    if (ctx.dims().size() > 1) {
                        dataCode += ctx.dims(0).getText() + " ";
                    }
                    if (ctx.dims().size() > 1)
                        dataCode += ctx.dims(1).getText();
                    else if (ctx.dims().size() > 0)
                        dataCode += ctx.dims(0).getText();
                    dataCode += "\n";
                } else {
                    dataCode += ctx.ID().getText();
                    if (this.dataReader.getFloatData(ctx.ID().getText()) != null)
                        dataCode += " : " + this.dataReader.getFloatData(ctx.ID().getText());
                    if (ctx.dims().size() > 1)
                        dataCode += ctx.dims(0).getText() + " ";
                    if (ctx.dims().size() > 1)
                        dataCode += ctx.dims(1).getText();
                    else if (ctx.dims().size() > 0)
                        dataCode += ctx.dims(0).getText();
                    dataCode += "\n";
                }
                String dims = "";
                if(ctx.dims().size() > 1)
                    dims = ctx.dims(1).getText() ;
                else if(ctx.dims().size() > 0)
                    dims = ctx.dims(0).getText();
                String limit = "";
                if(ctx.limits() != null){
                    limit = ctx.limits().getText()+" ";
                }
                String[] temp = new String[3];
                temp[0] = dims;
                temp[1] = limit;
                temp[2] = ctx.type().PRIMITIVE().getText();
                datablkData.put(ctx.ID().getText(), temp);
            }
            else {
                if (ctx.type().COMPLEX().getText().equals("vector")){
                    dataCode += ctx.ID().getText();
                    dataCode += " : " + this.dataReader.getVector(ctx.ID().getText());
                    if (ctx.dims().size() > 1)
                        dataCode += ctx.dims(0).getText() + " ";
                    if (ctx.dims().size() > 1)
                        dataCode += ctx.dims(1).getText();
                    else if (ctx.dims().size() > 0)
                        dataCode += ctx.dims(0).getText();
                    dataCode += "\n";
                }
                else if (ctx.type().COMPLEX().getText().equals("matrix") || ctx.type().COMPLEX().getText().equals("cov_matrix")){
//                    dataCode += Utils.complexTypeMap(ctx.type().COMPLEX().getText())+" ";
                    dataCode += ctx.ID().getText();
                    dataCode += " : ";
                    String tmpData = this.dataReader.getData(ctx.ID().getText());
                    tmpData = tmpData.replaceAll("\\[", "<");
                    tmpData = tmpData.replaceAll("]", ">");
                    dataCode += tmpData;
                    if (ctx.type().COMPLEX().getText().equals("matrix")){
                        if(ctx.dims().size() > 1)
                            dataCode += ctx.dims(0).getText() + " ";
                        if(ctx.dims().size() > 1)
                            dataCode += ctx.dims(1).getText() ;
                        else if(ctx.dims().size() > 0)
                            dataCode += ctx.dims(0).getText();
                    } else {
                        if(ctx.dims().size() > 0){
                            dataCode += ctx.dims(0).getText();
                            dataCode = dataCode.substring(0, dataCode.length()-1);
                            dataCode += "," + ctx.dims(0).getText().substring(1);
                        }
                    }


                    dataCode+="\n";
                }else {
//                    dataCode += Utils.complexTypeMap(ctx.type().COMPLEX().getText())+" ";
                    dataCode += ctx.ID().getText();
                    dataCode += " : " + this.dataReader.getData(ctx.ID().getText());
                    if(ctx.dims().size() > 1)
                        dataCode += ctx.dims(0).getText() + " ";
                    if(ctx.dims().size() > 1)
                        dataCode += ctx.dims(1).getText() ;
                    else if(ctx.dims().size() > 0)
                        dataCode += ctx.dims(0).getText();
                    dataCode+="\n";
                }
                String dims = "";
                if(ctx.dims().size() > 1)
                    dims = ctx.dims(1).getText() ;
                else if(ctx.dims().size() > 0)
                    dims = ctx.dims(0).getText();
                String limit = "";
                if(ctx.limits() != null){
                    limit = ctx.limits().getText()+" ";
                }
                String[] temp = new String[3];
                temp[0] = dims;
                temp[1] = limit;
                temp[2] = ctx.type().COMPLEX().getText();
                datablkData.put(ctx.ID().getText(), temp);

            }
        }
        else if(curBlock == StanParser.ParamblkContext.class){
            String dims = "";
            if(ctx.dims().size() > 1)
                dims = ctx.dims(1).getText() ;
            else if(ctx.dims().size() > 0)
                dims = ctx.dims(0).getText();
            String limit = "";
            if(ctx.limits() != null){
                limit = ctx.limits().getText()+" ";
            }
            String[] attr = new String[3];
            attr[0] = dims;
            attr[1] = limit;
            if (ctx.type().COMPLEX() != null)
                attr[2] = ctx.type().COMPLEX().getText();
            else
                attr[2] = ctx.type().PRIMITIVE().getText();
            this.parameter.put(ctx.ID().getText(), attr);
        }
        else if(curBlock == StanParser.Transformed_data_blkContext.class) {
            if(ctx.type().PRIMITIVE() != null){
                modelCode += ctx.type().PRIMITIVE().getText().replace("real", "float").concat(" ");
                if(ctx.dims().size() > 1)
                    modelCode += ctx.dims(0).getText() + " ";

                if(ctx.limits() != null){
                    modelCode+= ctx.limits().getText()+" ";
                }
                modelCode += ctx.ID().getText();

                if(ctx.dims().size() > 1)
                    modelCode += ctx.dims(1).getText() ;
                else if(ctx.dims().size() > 0)
                    modelCode += ctx.dims(0).getText();

                modelCode+="\n";
            }  else {
                modelCode += Utils.complexTypeMap(ctx.type().COMPLEX().getText());
                if (ctx.dims().size() > 1)
                    modelCode += ctx.dims(0).getText() + " ";
                if (ctx.dims().size() > 1)
                    modelCode += ctx.dims(1).getText() + " ";
                else if (ctx.dims().size() > 0)
                    modelCode += ctx.dims(0).getText() + " ";

                if(ctx.limits() != null){
                    modelCode+= ctx.limits().getText()+" ";
                }
                modelCode += ctx.ID().getText();
                modelCode += "\n";
            }

        }
        else{
            if(ctx.type().PRIMITIVE() != null){
                modelCode += ctx.type().PRIMITIVE().getText().replace("real", "float")+" ";
                modelCode += ctx.ID().getText();
                if(ctx.dims().size() > 1)
                    modelCode += ctx.dims(0).getText() + " ";
                if(ctx.dims().size() > 1)
                    modelCode += ctx.dims(1).getText() ;
                else if(ctx.dims().size() > 0)
                    modelCode += ctx.dims(0).getText();
                modelCode+="\n";
            }
            else {
                modelCode += Utils.complexTypeMap(ctx.type().COMPLEX().getText()) + " ";
                if (ctx.dims().size() > 1){
                    modelCode += ctx.dims(0).getText() + " ";
                    modelCode += ctx.ID().getText();
                    modelCode += ctx.dims(1).getText() + " ";
                }
                else if (ctx.dims().size() > 0){
                    modelCode += ctx.dims(0).getText();
                    modelCode += ctx.ID().getText();
                } else {
                    modelCode += ctx.ID().getText();
                }
                modelCode += "\n";
            }
        }
        checkBlockEndAnnotation(ctx.getParent());

    }

    @Override
    public void enterFor_loop_stmt(StanParser.For_loop_stmtContext ctx) {
        this.modelCode+= String.format("for(%s in %s){\n", ctx.ID().getText(), ctx.range_exp().getText());
//        checkBlockEndAnnotation(ctx.getParent());
    }

    @Override
    public void exitFor_loop_stmt(StanParser.For_loop_stmtContext ctx) {
        this.modelCode += "}\n";
        checkBlockEndAnnotation(ctx.getParent());
    }

    @Override
    public void enterSample(StanParser.SampleContext ctx) {
        String name = ctx.expression().getText();
        name = name.split("\\[")[0];
        if (this.datablkData.get(name)!=null){
            this.modelCode += "observe(";
        }else{
            this.modelCode += String.format("%s := ", ctx.expression().getText());
        }
        if (this.curBlock.equals(StanParser.ModelblkContext.class)){
            this.modelData.add(ctx.expression().getText());
        }
        checkBlockEndAnnotation(ctx.getParent());
    }

    @Override
    public void exitSample(StanParser.SampleContext ctx) {
        String name = ctx.expression().getText();
        name = name.split("\\[")[0];
        if (this.parameter.get(name) != null && !((String[]) this.parameter.get(name))[2].equalsIgnoreCase("vector")){
            this.modelCode += ((String[]) this.parameter.get(name))[0];
            this.modelCode += ((String[]) this.parameter.get(name))[1];
        }
        this.modelCode += "\n";
    }


    private void checkBlockEndAnnotation(ParserRuleContext ctx) {
        if(Utils.checkIfLastStatement(ctx)){
            if(this.curBlock == StanParser.Transformed_data_blkContext.class){
                this.modelCode += "}\n\n";
            }
            else if(this.curBlock ==  StanParser.Transformed_param_blkContext.class){
                this.modelCode += "}\n\n";
            }
            else if(this.curBlock == StanParser.Generated_quantities_blkContext.class){
                this.modelCode += "}\n\n";
            }
        }
    }

    @Override
    public void enterIf_stmt(StanParser.If_stmtContext ctx) {
        this.modelCode += String.format("if(%s){\n", ctx.expression().getText());
    }

    @Override
    public void exitIf_stmt(StanParser.If_stmtContext ctx) {
        this.modelCode += "}\n";
        checkBlockEndAnnotation(ctx.getParent());
    }

    @Override
    public void enterBlock(StanParser.BlockContext ctx) {
        if(ctx.getParent() instanceof StanParser.If_stmtContext){
            if(((StanParser.If_stmtContext) ctx.getParent()).block().size() > 1 && ctx == ((StanParser.If_stmtContext) ctx.getParent()).block(1)){
                this.modelCode += "}else {\n";
            }
        }
    }

    @Override
    public void enterPrint_stmt(StanParser.Print_stmtContext ctx) {
        this.modelCode += ctx.getText()+ "\n";
        checkBlockEndAnnotation(ctx.getParent());
    }


    @Override
    public void enterDistribution_exp(StanParser.Distribution_expContext ctx) {
        String name = ctx.parent.getChild(0).getText();
        name = name.split("\\[")[0];
        String params = "";
        for(StanParser.ExpressionContext expr: ctx.expression()){
            params += new Stan2IRVisitor().visit(expr) + ",";
        }
        if (this.datablkData.get(name) != null){
            this.modelCode += String.format("%s(%s), %s)", ctx.ID().getText(), params.substring(0, params.length()-1), ctx.parent.getChild(0).getText());
        }
        else{
            String vec = "";
            if (this.parameter.get(name) != null && ((String[]) this.parameter.get(name))[2].equalsIgnoreCase("vector")){
                vec = ((String[]) this.parameter.get(name))[0];
                vec = vec.replaceAll("\\[", "<");
                vec = vec.replaceAll("]", ">");
            }

            this.modelCode += String.format("%s%s(%s)", ctx.ID().getText(), vec, params.substring(0, params.length()-1));
        }
    }



    @Override
    public void enterAssign_stmt(StanParser.Assign_stmtContext ctx) {
        String name = new Stan2IRVisitor().visit(ctx.expression(0));
        this.modelCode += String.format("%s = %s\n", name, new Stan2IRVisitor().visit(ctx.expression(1)));
       checkBlockEndAnnotation(ctx.getParent());
    }

    @Override
    public void enterFunction_call_stmt(StanParser.Function_call_stmtContext ctx) {
        this.modelCode += new Stan2IRVisitor().visit(ctx.function_call()) + "\n";
        checkBlockEndAnnotation(ctx.getParent());
    }

    @Override
    public void enterTarget_stmt(StanParser.Target_stmtContext ctx) {
        this.modelCode += "target = target + " + new Stan2IRVisitor().visit(ctx.expression()) + "\n";
        checkBlockEndAnnotation(ctx.getParent());
    }

    @Override
    public void enterDatablk(StanParser.DatablkContext ctx) {
        this.curBlock = ctx.getClass();
    }

    @Override
    public void enterModelblk(StanParser.ModelblkContext ctx) {
        this.curBlock = ctx.getClass();
    }

    @Override
    public void exitModelblk(StanParser.ModelblkContext ctx) {
        for (String para: this.parameter.keySet()) {
            if (!this.modelData.contains(para))
                modelCode += para + " := normal(1234.0,1234.0)" + ((String[]) this.parameter.get(para))[0] + ((String[]) this.parameter.get(para))[1] + "\n";
        }
    }

    @Override
    public void enterTransformed_data_blk(StanParser.Transformed_data_blkContext ctx) {
        this.curBlock = ctx.getClass();
        this.modelCode += "\ntransformeddata{\n";
    }

    @Override
    public void enterTransformed_param_blk(StanParser.Transformed_param_blkContext ctx) {
        this.curBlock = ctx.getClass();
        this.modelCode += "\ntransformedparam{\n";
    }

    @Override
    public void enterFunctions_blk(StanParser.Functions_blkContext ctx) {
        this.curBlock = ctx.getClass();
    }

    @Override
    public void enterGenerated_quantities_blk(StanParser.Generated_quantities_blkContext ctx) {
        this.curBlock = ctx.getClass();
        this.modelCode += "\ngeneratedquantities{\n";
    }

    @Override
    public void enterParamblk(StanParser.ParamblkContext ctx) {
        this.curBlock = ctx.getClass();
    }

    public String getCode(){
        return this.dataCode + this.modelCode;
    }
}
