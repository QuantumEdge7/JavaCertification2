package chapter8;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class FileDemo3 {

    public static void main(String[] args) {
        String filePath = "C:/Users/zahee/OneDrive/Desktop/filedemo/demo1.txt";
        File file = new File(filePath);
        System.out.println(file.getName());
        System.out.println(file.isAbsolute());
        System.out.println(file.isHidden());
        System.out.println(file.isDirectory());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isFile());
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
//        file.setWritable(false);
        System.out.println(file.canWrite());
//        file.setReadable(false);

        System.out.println(file.getPath());
        System.out.println(file.getTotalSpace());
        System.out.println(file.getUsableSpace());
        System.out.println(file.getFreeSpace());

        long lastModified = file.lastModified();
        System.out.println(lastModified);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String modifiedTime = dateFormat.format(new Date(lastModified));
        System.out.println(modifiedTime);

//        String filePath1 = "C:/Users/zahee/OneDrive/Desktop/filedemo/demo2.txt";
//        boolean isRenamed = file.renameTo(new File(filePath1));
//        System.out.println(isRenamed);

        System.out.println(file.exists());
        boolean isDeleted = file.delete();
        System.out.println(isDeleted);
        System.out.println(file.exists());

    }
}