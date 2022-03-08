import java.util.Arrays;
import java.util.Scanner;

public class StrMain1 {
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków");
        String string = scanner.nextLine();

        int myLength = string.length();
        String myArray[] = new String[myLength];
        char[] chArray = string.toCharArray();
        System.out.println(Arrays.toString(chArray));
        char myChar = chArray[myLength - 1];

        for (char x : chArray) {
            if (x == myChar) {
                i++;
            }
        }

        System.out.println(i);

    }
}
