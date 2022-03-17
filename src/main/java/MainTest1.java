import java.util.Scanner;

public class MainTest1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double d1 = getD1(scanner);

        double d2 = getD1(scanner);

        double result = d1 / d2;
        System.out.println("The aswear is " + result);

    }

    private static double getD1(Scanner scanner) {
        System.out.println("Enter a numeric value: ");
        double d1 = scanner.nextInt();
        return d1;
    }
}
