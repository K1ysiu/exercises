import java.util.Scanner;

public class SkanerCheckIntLoop {
    public static void main(String[] args) {
        System.out.print("Podaj liczbę całkowitą:");
        Scanner scan = new Scanner(System.in);
//        try{
//            int number = scan.nextInt();
//            System.out.println(number);
//
//        } catch ( InputMismatchException e) {
//            System.out.println("Niepoprawne dane");
//        }

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Nierpawidłowe dane. Podaj jeszcze raz: ");
        }
        int number = scan.nextInt();
        System.out.println("Podałeś liczbę: " + number);

    }
}
