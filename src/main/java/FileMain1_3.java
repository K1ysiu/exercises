import java.io.File;
import java.io.IOException;
public class FileMain1_3 {
    public static void main(String args[])  throws IOException {
        //Creating a File object for directory
        File directoryPath = new File("src/main/resources/");
        //List of all files and directories
        File filesList[] = directoryPath.listFiles();
        System.out.println("List of files and directories in the specified directory:");
        for(File file : filesList) {
            System.out.println("File name: "+file.getName());
//            System.out.println("File path: "+file.getAbsolutePath());
//            System.out.println("Size :"+file.getTotalSpace());
//            System.out.println(" ");
        }
    }
}