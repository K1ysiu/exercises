import java.util.Scanner;

public class GuessNumber_better {
    public static void main(String[] args) {

        int randNumber = getRandomInt();
        System.out.println(randNumber);

        int userInputInt = getUserNumber();

        while (userInputInt != randNumber) {
            if (randNumber < userInputInt) {
                System.out.println(userInputInt + " is too much");
                userInputInt = getUserNumber();
            } else if (randNumber > userInputInt) {
                System.out.println(userInputInt + " is too low");
                userInputInt = getUserNumber();
            }

        }
        System.out.println("you got it!");
    }

    private static int getRandomInt() {
        return (int) ((Math.random() * (100 - 1)) + 1);
    }

    private static int getUserNumber() {
        String nextLine = getUserString();

        while (!isNumeric(nextLine)) {
            System.out.println(nextLine + " is not a number");
            nextLine = getUserString();
        }
        return Integer.parseInt(nextLine);
    }

    private static String getUserString() {
        System.out.println("Guess the number");
        return new Scanner(System.in).nextLine();
    }

    private static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int i = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {

            return false;
        }
        return true;
    }
}
