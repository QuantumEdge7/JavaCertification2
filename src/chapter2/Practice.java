package chapter2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Practice {
    public static void main(String[] args) {
        Path path1 = Paths.get("/software/././sys/readme.txt");
        Path path2 = path1.normalize();
        Path path3 = path2.relativize(path1);
        System.out.print(path1.getNameCount());
        System.out.print(" : " + path2.getNameCount());
        System.out.print(" : " + path3.getNameCount());
        //5 : 3 : 1
    }
}
