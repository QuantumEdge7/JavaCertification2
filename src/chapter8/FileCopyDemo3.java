package chapter8;

import java.io.*;

public class FileCopyDemo3 {
    public static void main(String[] args) {
        String fileReadPath = "C:/Users/zahee/OneDrive/Desktop/filedemo/intro.txt";
        String fileWritePath = "C:/Users/zahee/OneDrive/Desktop/filedemo/copy3.txt";

        try (
                FileReader fr = new FileReader(fileReadPath);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(fileWritePath);
                BufferedWriter bw = new BufferedWriter(fw);
        ) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
