import java.io.FileInputStream;
import java.io.IOException;
public class ReadBytes {
  public static void main(String[] args) {
    FileInputStream
      fileInputStream = null;
    try {
      fileInputStream = new FileInputStream("example.txt");
      int byteDate;
      while (byteData = fileInputStream.read()!=-1) {
        System.out.print((char) byteDate);
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
}
