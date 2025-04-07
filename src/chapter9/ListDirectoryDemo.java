package chapter9;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListDirectoryDemo {
    public static void main(String[] args) {
        Path dir = Paths.get(".");

        try (DirectoryStream<Path> fileName =
                     Files.newDirectoryStream(dir)) {
            for (Path file : fileName) {
                System.out.println(file.getFileName());
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
