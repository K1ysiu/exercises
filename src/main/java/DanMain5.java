import java.util.Scanner;

public class DanMain5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = "";
        do {
            System.out.println("Type text");
            myString = scanner.nextLine();
            System.out.println(myString);


        } while (!"Quit".equals(myString));

    }
}
