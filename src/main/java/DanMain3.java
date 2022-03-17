import java.util.Scanner;

public class DanMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myNumber;
        int count = 0;
        int sum = 0;


        do {
            System.out.println("Type number");
            myNumber = scanner.nextInt();
            count++;
            sum = sum + myNumber;

            System.out.println("my number= " + myNumber);
            System.out.println("number count= " + count);
            System.out.println("sum= " + sum);

        } while (myNumber != 0);


    }
}
