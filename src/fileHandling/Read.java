package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    public static void main(String[] args) {
        System.out.println();
        String path="src/fileHandling/info.txt";
        try {
            FileReader reader = new FileReader(path); // instantial filereader and pass in file to be read
            /* 
            reader return sthe numerical character representation 
            of each character in the file, so we store it inside an 
            integer and display it by casting as follows
            reads a character at a time
            */

            int numerical_char = reader.read(); //first character is read here
            while (numerical_char != -1) { // returns -1 when there are no more characters in the file to be read
                System.out.print((char)numerical_char); // cast the ascii_value to char
                numerical_char = reader.read(); // read next character of file
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error reading file");
            e.printStackTrace();
        }
        System.out.println("\n\n");
    }
    
}
