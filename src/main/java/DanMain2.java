import java.util.Scanner;

public class DanMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number");
        double a = scanner.nextInt();
        System.out.println("Second number");
        double b = scanner.nextInt();

        double abAdd = a + b;
        double abSub = a - b;
        double abMulti = a * b;
        double abDiv = a / b;

        System.out.println(abAdd + " " + abSub + " " + abMulti + " " + abDiv);

    }
}
