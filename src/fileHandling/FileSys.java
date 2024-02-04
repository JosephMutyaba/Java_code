package fileHandling;

import java.io.File;

public class FileSys {
    public static void main(String[] args) {
        System.out.println();
        String path ="src/fileHandling/info.txt";
        File file = new File(path);

        if (file.exists()) {
            System.out.println(path + " exists");

            if(file.isDirectory()) {
                System.out.println("File " + path + " is a directory");
                System.out.println("Relative path: "+file.getPath());
                System.out.println("Absolute path: "+file.getAbsolutePath());
            }else{
                System.out.println("File " + path + " is a file");
                System.out.println("Relative path: "+file.getPath());
                System.out.println("Absolute path: "+file.getAbsolutePath());
            }
    
        }else{
            System.out.println("File " + path + " does not exist");
        }



    }
    
}
