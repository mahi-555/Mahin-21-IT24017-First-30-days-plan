import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class void main(String[] args) {
  try {
    FileWriter writer = new FileWriter("output.txt");
    BufferedWriter bufferedWriter = new BufferedWriter(writer);

    bufferedWriter.write("Hello,World!");
    bufferedWriter.newLine();
    bufferedWriter.write("This is a Java file handling example."):
    bufferedWriter.close();
    Sytem.out.println("Data written to file successfully.");
  } catch (IOException e) {
    System.out.println("An error occured : " + e.getMessage());
  }
}
}

