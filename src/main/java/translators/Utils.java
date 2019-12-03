package translators;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.*;
import java.util.ArrayList;

import java.util.List;
import java.util.Properties;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Pair;
import translator.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Utils {
    public static String complexTypeMap(String type){
        if(type.equals("simplex"))
            return "vector";
        else if(type.equals("vector")){
            return type;
        }
        else if(type.equals("matrix")){
            return type;
        }
        else if(type.equals("cov_matrix")){
            return "matrix";
        }
        else {
            System.out.println(type);
            assert false;
        }
        return "";
    }

    public static boolean checkIfLastStatement(ParserRuleContext statementContext){
        if(statementContext.getParent() instanceof StanParser.BlockContext){
            StanParser.BlockContext blockContext = (StanParser.BlockContext) statementContext.getParent();
            if(blockContext.getParent() instanceof StanParser.Transformed_param_blkContext || blockContext.getParent() instanceof StanParser.Transformed_data_blkContext || blockContext.getParent() instanceof StanParser.Generated_quantities_blkContext) {
                if (blockContext.statement(blockContext.statement().size() - 1) == statementContext) {
                    // last statement
                    return true;
                }
            }
        }

        return false;

    }
}
