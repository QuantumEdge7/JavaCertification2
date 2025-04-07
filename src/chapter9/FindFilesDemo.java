package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FindFilesDemo {
    public static void main(String[] args) {

        String filePath = "C:/Users/zahee/OneDrive/Desktop/filedemo";
        Path dir = Paths.get(filePath);

        try ( //searching for  files that ends in ".txt" in filedemo directory
              //depending on maxDepth int provided
                Stream<Path> findFiles = Files.find(
                        dir, Integer.MAX_VALUE,
                (x, attr) ->
                        x.toString().endsWith(".txt") && attr.isRegularFile())) {
            findFiles.forEach(System.out::println);
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
