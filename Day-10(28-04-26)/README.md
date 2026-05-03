## Example 01
``` java
import java.io.File;
public class FileExample {
  publiv static void main(String[] args) {
    File myFile = new File("example.txt");
    if (myFile.exists()) {
      System.out.println("File exists.");
    } else {
      System.out.println("File does not exist. ");
    }
  }
}
```

## Example 02
``` java
