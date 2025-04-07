package chapter8;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) {
        String filePath = "C:/Users/zahee/OneDrive/Desktop/filedemo/demo1.txt";
        File file = new File(filePath);
        try {
            if(file.createNewFile()){
                System.out.println("file is created.");
            } else {
                System.out.println("file already exists.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
