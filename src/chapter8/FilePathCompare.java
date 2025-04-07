package chapter8;

import java.io.File;

public class FilePathCompare {
    public static void main(String[] args) {
        String filePath = "C:/Users/zahee/OneDrive/Desktop/filedemo/demo1.txt";
        File file1 = new File(filePath);
        File file2 = new File(filePath);
        if(file1.compareTo(file2) == 0){
            System.out.println("Both paths are same");
        } else {
            System.out.println("Paths are not same.");
        }
        //Both paths are same
    }
}
