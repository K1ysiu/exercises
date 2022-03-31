import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileMain1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type file name");
        String myFileName = scanner.nextLine();
        Path path = Paths.get("src/main/resources/" + myFileName);
        System.out.println(Files.exists(path));

        if (Files.exists(path)) {
            System.out.println("File alredy exist");
        } else {
            try {
                Files.createFile(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
