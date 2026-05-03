import java.io.File;
public class ListDirectoryContents {
  public static void main(String[] args) {
    String directoryPath = "Projects/Java";
    File directory = new File(directoryPath);
    String[] contents = directory.list();
    if(contents !=Null) {
      System.out.println(" Contents of " + directoryPath + ":");
      for (String fileName : contents ) {
        System.out.println(fileName);
      }
    } else {
      System.out.println( "This directory is empty or does not exists.");
    }
  }
}
      
