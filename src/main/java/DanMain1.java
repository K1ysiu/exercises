import java.util.Scanner;

public class DanMain1 {
    public static void main(String[] args) {
        System.out.println("Type your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Type your age: ");
        String age = scanner.nextLine();

        System.out.println(name + " has " + age + " yo");

    }
}
