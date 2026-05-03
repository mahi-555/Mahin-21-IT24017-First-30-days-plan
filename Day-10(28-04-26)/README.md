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
import java.io.File;
import java.io.IOException;

public class FileExample2 {
    public static void main(String[] args) {
        try {
            File myFile = new File("testfile.txt");

            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }

      
            System.out.println("File path: " + myFile.getAbsolutePath());
            System.out.println("Writable: " + myFile.canWrite());
            System.out.println("Readable: " + myFile.canRead());
            System.out.println("File size: " + myFile.length() + " bytes");

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
```
