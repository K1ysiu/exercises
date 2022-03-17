import java.util.Scanner;

public class DanMain7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myCase;

        do {
            System.out.println("Type bn to get gross->net or nb to get net->gross");
            myCase = scanner.nextLine();
        } while ((!"bn".equals(myCase)) && (!"nb".equals(myCase)));

        System.out.println("Type value");
        double myVal = scanner.nextDouble();
        double myResult;
        if ("bn".equals(myCase)) {
            myResult = myVal - (myVal * 0.17);
        } else {
            myResult = myVal + (myVal * 0.17);
        }
        System.out.println(myResult);

    }
}

