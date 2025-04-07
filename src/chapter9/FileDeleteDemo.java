package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileDeleteDemo {
    public static void main(String[] args) {
        String filePath = "C:/Users/zahee/OneDrive/Desktop/filedemo/output.txt";
        Path path = Paths.get(filePath);

        try {
           Files.deleteIfExists(path);
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
