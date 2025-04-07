package chapter9;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCheckDemo {
    public static void main(String[] args) {
        String filePath = "C:/Users/zahee/OneDrive/Desktop/filedemo/Intro.txt";
        Path path = Paths.get(filePath);
        if(Files.exists(path)){
            System.out.println("File exists");
        } else {
            System.out.println("File does not exists.");
        }//File exists
    }
}
