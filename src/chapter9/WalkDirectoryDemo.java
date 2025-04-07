package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class WalkDirectoryDemo {
    public static void main(String[] args) {

        String filePath = "C:/Users/zahee/OneDrive/Desktop/filedemo";
        Path dir = Paths.get(filePath);

        try (Stream<Path> walkFile = Files.walk(dir, 2)) {
            walkFile.forEach(System.out::println);
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
