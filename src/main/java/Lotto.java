import java.util.*;

public class Lotto {
    public static void main(String[] args) {

        extracted(getNumberList());

    }

    private static void extracted(ArrayList<Integer> numberList) {
        int count = 0;

        ArrayList<Integer> numbersLotto = myNumbers();

        for (int lottoNumber : numbersLotto) {
            for (int myNumber : numberList) {
                if (lottoNumber == myNumber) {
                    count = count + 1;
                }
            }
        }
        System.out.println("Your numbers: " + numberList + "\n"
                + "Lotto numbers: " + numbersLotto + "\n"
                + "you got " + count + " hits");
    }

    private static ArrayList<Integer> getNumberList() {
        ArrayList<Integer> numberList = new ArrayList<>(6);

        while (numberList.size() != 6) {
            int userInputInt = getUserNumber();

            while (numberList.contains(userInputInt)) {
                System.out.println(userInputInt + " is already picked.");
                userInputInt = getUserNumber();
            }
            while (userInputInt > 49 || userInputInt < 1) {
                System.out.println(userInputInt + " is not in range 1-49");
                userInputInt = getUserNumber();
            }
            numberList.add(userInputInt);
        }
        Collections.sort(numberList);
        return numberList;
    }

    private static ArrayList<Integer> myNumbers() {
        ArrayList<Integer> lottoNumbers = new ArrayList<>(6);
        while (lottoNumbers.size() < 6) {
            lottoNumbers.add((int) (Math.random() * (49 - 1) + 1));
        }
        return lottoNumbers;
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
        System.out.println("Type number 1-49");
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
