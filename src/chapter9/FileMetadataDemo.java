package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileMetadataDemo {
    public static void main(String[] args) {
        String filePath = "C:/Users/zahee/OneDrive/Desktop/filedemo/Intro.txt";
        Path path = Paths.get(filePath);

        try {
            BasicFileAttributes attrs = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("Creation time: " + attrs.creationTime());
            //Creation time: 2025-02-26T17:52:13.3015766Z
            System.out.println("Last modified time: " + attrs.lastModifiedTime());
            //Last modified time: 2025-02-24T23:52:17.7571623Z
            System.out.println("Size: " + attrs.size() + " bytes");
            //Size: 142 bytes
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
