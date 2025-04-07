package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectoryDemo {
    public static void main(String[] args) {
        String filePath = "C:/Users/zahee/OneDrive/Desktop/filedemo/demo_directory";
        Path dir = Paths.get(filePath);

        try {
            Files.createDirectory(dir);
            System.out.println("Directory created successfully.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
