package chapter9;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class WriteFileDemo {
    public static void main(String[] args) {
        String filePath = "C:/Users/zahee/OneDrive/Desktop/filedemo/my_output.txt";
        Path path = Paths.get(filePath);
        List<String> content = List.of(
                "Hello", "Java", "Streams", "NIO2", "Demo");

        try {
            Files.write(path, content,
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("File written successfully.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
