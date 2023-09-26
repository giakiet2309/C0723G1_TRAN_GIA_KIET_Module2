package testdocghi.ReadAndWrite;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String> read(String filePatch){
         BufferedReader bufferedReader = null;
         try{
            bufferedReader = new BufferedReader(new FileReader(new File(filePatch)));
            List<String> strings = new ArrayList<>();
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                strings.add(line);
            }
            return strings; 
         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         } catch (IOException e) {
             throw new RuntimeException(e);
         } finally {
             if(bufferedReader!=null){
                 try {
                     bufferedReader.close();
                 } catch (IOException e) {
                     throw new RuntimeException(e);
                 }
             }
         }
    }
    public static void write(String filePatch,List<String> strings){
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(new File(filePatch)));
            for(String stringlist:strings){
                bufferedWriter.write(stringlist);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(bufferedWriter!=null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
