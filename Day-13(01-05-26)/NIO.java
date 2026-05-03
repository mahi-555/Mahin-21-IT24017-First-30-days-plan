
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
public class CreateDirectonaryNIO {
  public static void main(String[] args) {
      Path path = Paths.get("Projects/NioExample");
    
    try {
      Path createdDir = Files.createDirectories(path);
       System.out.print("Directory created successfully: " + createdDir.toString());
    }
    catch ( IOExpection e) {
      System.out.println("Failed to create directory: " + e.getMessage());
      }
    }
  }
