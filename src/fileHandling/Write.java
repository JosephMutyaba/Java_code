package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        String path="src/fileHandling/info.txt";

        try {
            FileWriter fw = new FileWriter(path);

            fw.write("Jesus, I Trust In You\nForever I will sing of Your faithfullness\nChrist My Redeemer");
            fw.append("\nMy Redeemer is Faithful and true.\n(Joseph Mutyaba------probably----------)");

            fw.close();

        } catch (IOException e) {
            
            e.printStackTrace();
        }
        
    }
}
