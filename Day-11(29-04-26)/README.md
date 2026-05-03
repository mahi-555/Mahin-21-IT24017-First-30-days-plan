## Example 01
``` java
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.oi.IOException;
public class FileCopy {
  public static void main(String[] args) {
    FileInputStream inputFile = null;
    FileInputStream outputFile = null;
    try {
      InputFile = new FileInputStream("source.txt");
      outputFile = new FileOutputStream("destination.txt");
      int byteData;
      while (byteData = fileInputStream.read()!=-1) {
        ouutputFille.write(byte);
      }
    }
    catch ( IOExpection e) {
      e.printStackTrace();
    } finally {
      if (fileInputStream != null) {
        try {
          fileInputStream.c lose();
        } catch (IOException e) { 
          e.printStackTrace();
        }
      }
    }
  }
```
}
      
      
