import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek użytkownika");
        int age = scanner.nextInt();

        System.out.println(checkMaturity(age));
    }
    static boolean checkMaturity(int age){
        if (age >= 18){
            return true;
        }else{
            return false;
        }
    }
}

