package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileMoveDemo {
    public static void main(String[] args) {
        String fileReadPath = "C:/Users/zahee/OneDrive/Desktop/filedemo/Intro_copy.txt";
        Path source = Paths.get(fileReadPath);

        String fileWritePath = "C:/Users/zahee/OneDrive/Desktop/filedemo/demo/into_moved.txt";
        Path target = Paths.get(fileWritePath);

        try {
            Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
