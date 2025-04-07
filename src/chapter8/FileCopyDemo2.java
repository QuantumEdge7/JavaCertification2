package chapter8;

import java.io.*;

public class FileCopyDemo2 {
    public static void main(String[] args) {
        String fileReadPath = "C:/Users/zahee/OneDrive/Desktop/filedemo/intro.txt";
        String fileWritePath = "C:/Users/zahee/OneDrive/Desktop/filedemo/copy2.txt";

        try (
                FileReader fr = new FileReader(fileReadPath);
                FileWriter fw = new FileWriter(fileWritePath);
        ) {

            int len;
            while ((len = fr.read()) != -1) {
                System.out.println(len);
                fw.write(len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
