## Example 01
```java
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
```


## Example 02
``` java
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
```
