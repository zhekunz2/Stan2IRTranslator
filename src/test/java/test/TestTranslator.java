package test;

import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import translator.StanParser;
import translators.Translator;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestTranslator {

    @Test
    public void test1() throws IOException {
        List<String> exception = new ArrayList<>();
        exception.add("egidi");

        exception.add("regulate");
        exception.add("laitinen");
        exception.add("modrak");


        File file = new File("/Users/zhekunz2/Desktop/SixthSense/example-models/time_series");
        String[] directories = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File current, String name) {
                return new File(current, name).isDirectory();
            }
        });
        Arrays.sort(directories);
        for (String name : directories){
            if (!exception.contains(name)){
                System.out.println("Translating: "+name);
                Translator stan2IRTranslator = new Translator("/Users/zhekunz2/Desktop/SixthSense/example-models/time_series/"+name+"/"+name+".stan", "/Users/zhekunz2/Desktop/SixthSense/example-models/time_series/"+name+"/"+name+".data.R");
                String code = stan2IRTranslator.getCode();
                FileUtils.writeStringToFile(new File("/Users/zhekunz2/Desktop/SixthSense/example-models/time_series/"+name+"/"+name+".template"), code);
                System.out.println(code);
                System.out.println("\nTranslation for " + name + " done!\n");
            }
        }

    }

    @Test
    public void test2() throws IOException {
        String name = "model10-2";
        System.out.println("Translating: "+name);
        Translator stan2IRTranslator = new Translator("/Users/zhekunz2/Desktop/SixthSense/example-models/time_series/"+name+"/"+name+".stan", "/Users/zhekunz2/Desktop/SixthSense/example-models/time_series/"+name+"/"+name+".data.R");
        String code = stan2IRTranslator.getCode();
        FileUtils.writeStringToFile(new File("/Users/zhekunz2/Desktop/SixthSense/example-models/time_series/"+name+"/"+name+".template"), code);
        System.out.println(code);
        System.out.println("\nTranslation for " + name + " done!\n");

    }
}
