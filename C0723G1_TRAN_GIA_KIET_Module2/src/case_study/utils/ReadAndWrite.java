package case_study.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String> read(String filePatch) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(filePatch)))) {
            List<String> strings = new ArrayList<>();
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                strings.add(line);
            }
            return strings;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void write(String filePatch, List<String> strings) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(filePatch)))) {
            for (String stringList : strings) {
                bufferedWriter.write(stringList);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
