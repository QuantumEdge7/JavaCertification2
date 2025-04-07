package chapter8;

import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class DrivesExample {
    public static void main(String[] args) {
        FileSystemView fileSystemView = FileSystemView.getFileSystemView();
        System.out.println("Home directory: " + fileSystemView.getHomeDirectory());

        File[] fileRoots = File.listRoots();
        for (int i = 0; i < fileRoots.length; i++) {
            System.out.println();
            System.out.println("System drive: " + fileRoots[i]);
            System.out.println("Drive display name: "+fileSystemView.getSystemDisplayName(fileRoots[i]));
            System.out.println("Is drive: "+fileSystemView.isDrive(fileRoots[i]));
            System.out.println("Readable "+fileRoots[i].canRead());
            System.out.println("Writable: "+fileRoots[i].canWrite());
        }
    }
}
