import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        try {
        
            BufferedWriter bw = new BufferedWriter(new FileWriter("output2.txt", true));

            bw.write("First line of text.");
            bw.newLine();
            bw.write("Second line added using BufferedWriter.");
            bw.newLine();

            bw.close();
            System.out.println("Data written successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
