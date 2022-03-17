import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileMain1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File("readFile.txt");
        try{
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){
                stringBuilder.append(scan.nextLine() + "\n") ;
            }

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
