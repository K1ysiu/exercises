import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMain1_1 {
    public static void main(String[] args){

        Path path = Paths.get("src/main/resources1/");
        try {
            if(!Files.exists(path)){
                Files.createDirectory(path);
            } else {
                System.out.println("Folder alredy exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
