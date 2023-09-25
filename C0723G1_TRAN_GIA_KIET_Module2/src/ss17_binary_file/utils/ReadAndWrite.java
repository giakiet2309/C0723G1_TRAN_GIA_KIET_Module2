package ss17_binary_file.utils;

import ss17_binary_file.model.Expenditure;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void writeFile(String path, List<Expenditure> expenditures) {
        try (FileOutputStream fos = new FileOutputStream(path);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Expenditure expenditure : expenditures) {
                oos.writeObject(expenditure);
            }
            oos.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<Expenditure> readFile(String path) {
        List<Expenditure> expenditures = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(path);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (fis.available() > 0) {
                Expenditure expenditure = (Expenditure) ois.readObject();
                expenditures.add(expenditure);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return expenditures;
    }
}
