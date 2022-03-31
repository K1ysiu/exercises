import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int randNumber = getRandomInt();
        System.out.println(randNumber);
        String userInputString = getUserNumber();

        while (!isNumeric(userInputString)) {
            System.out.println(userInputString + " is not a number");
            userInputString = getUserNumber();
        }

        int userInputInt = Integer.parseInt(userInputString);

        while (userInputInt != randNumber){

            userInputInt = Integer.parseInt(userInputString);

            if (randNumber < userInputInt) {
                System.out.println( userInputString + " is too much");
                userInputString = getUserNumber();
            } else if (randNumber > userInputInt) {
                System.out.println(userInputString + " is too low");
                userInputString = getUserNumber();
            } else {
                System.out.println("you got it!");
                break;
            }

        }
    }

   private static int getRandomInt() {
        return (int) ((Math.random() * (100 - 1)) + 1);
    }
    private static String getUserNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number");
        return scanner.nextLine();
    }

    public static boolean isNumeric(String strNum) {
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
