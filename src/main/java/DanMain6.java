import java.util.Scanner;

public class DanMain6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type a value");
        int a = scanner.nextInt();

        System.out.println("type b value");
        int b = scanner.nextInt();

        System.out.println("type c value");
        int c = scanner.nextInt();

        double delta = b * b - 4 * a * c;
        System.out.println("delta=" + delta);
        double x0;
        double x1;
        double x2;
        double sqrtDelta = Math.sqrt(delta);

        if (delta > 0) {
            x1 = ((-b - sqrtDelta )/ 2 * a);
            x2 = ((-b + sqrtDelta) / 2 * a);
            System.out.println("Square root 1= " +x1 + " square root 2= "+ x2);
        } else if( delta == 0 ) {
            x0 = -b/(2*a);
            System.out.println("Square root = " +x0);
        } else {
            System.out.println("There is no square root.");

        }
    }
}
