package translators;


import translator.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataReader extends DataBaseListener {

    private String curId;
    private Map<String, Object> dataMap = new HashMap<>();
    private String curString = "";
    private ArrayList<String> curArr;
    private ArrayList<Integer> curDim;

    @Override
    public void enterAssign(DataParser.AssignContext ctx) {
        this.curId = ctx.ID().getText();
    }

    @Override
    public void enterArray(DataParser.ArrayContext ctx) {
        if(ctx.getParent() instanceof DataParser.DimContext){
            curDim = new ArrayList<>();
            for(DataParser.PrimitiveContext pr: ctx.primitive()){
                curDim.add(Integer.parseInt(pr.getText()));
            }
        }
        else {
            curArr = new ArrayList<>();
            for (DataParser.PrimitiveContext pr : ctx.primitive()) {
                curArr.add(pr.getText());
            }
        }
    }

    @Override
    public void exitStructure(DataParser.StructureContext ctx) {
        if(curDim != null && curDim.size() == 2){
            String arr[][]  = new String[curDim.get(0)][curDim.get(1)];
            for(int j=0; j<curDim.get(1);j++){
                for(int i=0; i<curDim.get(0); i++){
                    // getting in column major and storing in row major
                    arr[i][j] = curArr.get(i*curDim.get(1)+j);
                }
            }
            this.dataMap.put(this.curId, arr);
            return;
        } else if (curDim != null && curDim.size() == 3){
            String arr[][][]  = new String[curDim.get(0)][curDim.get(1)][curDim.get(2)];
            for (int k=0; k<curDim.get(2); k++){
                for(int j=0; j<curDim.get(1);j++){
                    for(int i=0; i<curDim.get(0); i++){
                        // getting in column major and storing in row major
                        arr[i][j][k] = curArr.get(i*curDim.get(1)*curDim.get(2)+j*curDim.get(2)+k);
                    }
                }
            }
            this.dataMap.put(this.curId, arr);
            return;
        }

        assert false;
    }

    @Override
    public void exitAssign(DataParser.AssignContext ctx) {
        if(ctx.dt().array() != null)
            this.dataMap.put(this.curId, curArr);
        else if(ctx.dt().primitive() != null)
            this.dataMap.put(this.curId, ctx.dt().primitive().getText());
    }

    public void printData(){
        for(String id:this.dataMap.keySet()){
            if(this.dataMap.get(id) instanceof ArrayList)
                System.out.println(id + " : " + ((ArrayList<String>) this.dataMap.get(id)).toString());
            else if(this.dataMap.get(id) instanceof String[][])
                System.out.println(id + " : " + strArrtoString((String[][]) this.dataMap.get(id)) );
            else if(this.dataMap.get(id) instanceof String){
                System.out.println(id + " : " + this.dataMap.get(id));
            }
        }
    }

    public String getData(String id){
        if(this.dataMap.get(id) instanceof ArrayList)
            return ((ArrayList<String>) this.dataMap.get(id)).toString();
        else if(this.dataMap.get(id) instanceof String[][])
            return  strArrtoString((String[][]) this.dataMap.get(id));
        else if(this.dataMap.get(id) instanceof String){
            return (String) this.dataMap.get(id);
        }
        return null;
    }


    public String getFloatData(String id){

        if(this.dataMap.get(id) instanceof ArrayList)
            return arrToFloatString((ArrayList<String>) this.dataMap.get(id));
        else if(this.dataMap.get(id) instanceof String[][])
            return  strArrtoFloatString((String[][]) this.dataMap.get(id));
        else if(this.dataMap.get(id) instanceof String){
            return (String) this.dataMap.get(id);
        }
        return null;
    }

    public String arrToFloatString (ArrayList<String> arr){
        StringBuilder res = new StringBuilder("[");
        for(int i = 0; i<arr.size(); i++){
            String temp;
            if (arr.get(i).contains(".")){
                temp = arr.get(i);
            } else {
                temp = arr.get(i).concat(".0");
            }
            res.append(temp).append(", ");
        }

        return res.substring(0, res.length()-2) + "]";
    }

    public String getVector(String id){
        if(this.dataMap.get(id) instanceof ArrayList)
            return arrToVecString((ArrayList<String>) this.dataMap.get(id));
        else if(this.dataMap.get(id) instanceof String[][])
            return  strArrtoString((String[][]) this.dataMap.get(id));
        else if(this.dataMap.get(id) instanceof String){
            return (String) this.dataMap.get(id);
        }
        return null;
    }

    private String arrToVecString(ArrayList<String> arr){
        StringBuilder res = new StringBuilder("<");
        for(int i = 0; i<arr.size(); i++){
            res.append(arr.get(i)).append(", ");
        }
        return res.substring(0, res.length()-2) +">";
    }



    private String strArrtoString(String[][] arr){
        StringBuilder res = new StringBuilder("[");
        for(int i = 0; i<arr.length; i++){
            res.append("[");
            for(int j=0; j<arr[0].length; j++){
                res.append(arr[i][j]).append(", ");
            }
            res.deleteCharAt(res.length()-1);
            res.deleteCharAt(res.length()-1);

            res.append("], ");
        }
        return res.substring(0, res.length()-2) +"]";
    }

    private String strArrtoFloatString(String[][] arr){
        StringBuilder res = new StringBuilder("[");
        for(int i = 0; i<arr.length; i++){
            res.append("[");
            for(int j=0; j<arr[0].length; j++){
                String temp;
                if (arr[i][j].contains(".")){
                    temp = arr[i][j];
                } else {
                    temp = arr[i][j].concat(".0");
                }
                res.append(temp).append(", ");
            }
            res.deleteCharAt(res.length()-1);
            res.deleteCharAt(res.length()-1);

            res.append("], ");
        }
        return res.substring(0, res.length()-2) +"]";
    }


}