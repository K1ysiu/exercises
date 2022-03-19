import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileMain3 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/txt1.txt");

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String myString = scanner.nextLine();
                //System.out.println(myString.toLowerCase().contains("Java"));
                if(myString.toLowerCase().contains("Javy".toLowerCase())){
                    System.out.println(myString);
                }
            }

        } catch (FileNotFoundException e) {
            e.getMessage();
        }


    }
}
