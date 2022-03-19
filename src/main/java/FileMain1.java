import jdk.nashorn.internal.ir.WhileNode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileMain1 {
    public static void main(String[] args) {
        File file = new File("Main.txt");

        try {
            Scanner scanner = new Scanner(file);
            PrintWriter printWriter = new PrintWriter("Main.txt");

            Scanner scanner1 = new Scanner(System.in);

            String input = null;

            while (!"Quit".equals(input)) {

                System.out.println("Type text");
                input = scanner1.nextLine();
                if (!"Quit".equals(input)){
                    printWriter.println(input);
                }
            }
            printWriter.close();



        } catch (FileNotFoundException e) {
            System.out.println("File not exist");
        }

    }
}


