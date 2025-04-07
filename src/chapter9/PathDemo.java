package chapter9;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) {
        String filePath = "C:/Users/zahee/OneDrive/Desktop/filedemo/Intro.txt";
        Path path = Paths.get(filePath);

//        System.out.println("File name: " + path.getFileName());//
//        // File name: Intro.txt
//        System.out.println("Parent directory: " + path.getParent());
//        //Parent directory: C:\Users\zahee\OneDrive\Desktop\filedemo
//        System.out.println("Is Absolute path? " + path.isAbsolute());
//        //Is Absolute path? true
//
//        Path absolutePath = path.toAbsolutePath();
//        System.out.println("Absolute path: " + absolutePath);
//        //C:\Users\zahee\OneDrive\Desktop\filedemo\Intro.txt

        Path normalizedPath = path.normalize();
        System.out.println("Normalized path: " + normalizedPath);
        //Normalized path: C:\Users\zahee\OneDrive\Desktop\filedemo\Intro.txt

        Path newPath = path.resolve("subfolder/intro2.txt");
        System.out.println("Resolved path: " + newPath);
        //Resolved path: C:\Users\zahee\OneDrive\Desktop\filedemo\Intro.txt\subfolder\intro2.txt

        System.out.println("Path elements count: " + path.getNameCount());//6

        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println("Element " + i + ": " + path.getName(i));
        }
        //Element 0: Users
        //Element 1: zahee
        //Element 2: OneDrive
        //Element 3: Desktop
        //Element 4: filedemo
        //Element 5: Intro.txt

        System.out.println("File object: " + path.toFile());
        //File object: C:\Users\zahee\OneDrive\Desktop\filedemo\Intro.txt

        try {
            Path realPath = path.toRealPath();
            System.out.println("Real path: " + realPath);
        } catch (IOException e) {
            System.out.println("File does not exist: " + e.getMessage());
        }
        //Real path: C:\Users\zahee\OneDrive\Desktop\filedemo\Intro.txt

    }
}
