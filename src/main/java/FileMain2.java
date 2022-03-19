import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileMain2 {
    public static void main(String[] args) {
        File file = new File("Main.txt");
        double myResult = 0;
        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNext()){
//                System.out.println(scanner.nextLine());
                String myString = scanner.nextLine();
                StringTokenizer stringTokenizer = new StringTokenizer(myString, ",");

                while (stringTokenizer.hasMoreTokens()){
                    String token = stringTokenizer.nextToken().trim();
                    boolean isNumeric = token.trim().matches("[+-]?\\d*(\\.\\d+)?");

                    if (isNumeric){
                        myResult = myResult + Double.parseDouble(token);
                    }
                }

            }
            System.out.println(myResult);
        } catch (FileNotFoundException e) {
            e.getMessage();
        }



    }
}
