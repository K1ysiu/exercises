
public class Dice {
    public static void main(String[] args) {
        String diceMove = "D18-18";

        int diceThrows = getNumOfThrows(diceMove);
        System.out.println("Dice throws: " + diceThrows);

        int diceSignIndex = indexOfSign(diceMove);

        int diceSides = getNumOfSides(diceMove, indexOfSign(diceMove));
        System.out.println("Number of sides " + diceSides);

        int diceModificator = getModificator(diceMove, diceSignIndex);
        System.out.println("Modificator: " + diceModificator);

        int sumResult = getSumResult(diceThrows, diceSides, diceModificator);

        System.out.println(sumResult);

    }

    private static int getSumResult(int diceThrows, int diceSides, int diceModificator) {
        int throwResult = 0;
        int sumResult = 0;

        do {
            throwResult = (int) (Math.random() * (diceSides - 1) + 1);
            diceThrows--;
            System.out.println(diceThrows + " roll = " + throwResult);
            sumResult = sumResult + throwResult;
        } while (0 != diceThrows);
        return sumResult + diceModificator;
    }

    public static int getModificator(String diceMove, int diceSignIndex) {
        if (diceSignIndex != 0) {
            return Integer.parseInt(diceMove.substring(diceSignIndex));
        } else {
            return 0;
        }
    }

    private static int indexOfSign(String diceMove) {
        if (diceMove.contains("+")) {
            return diceMove.indexOf("+");
        } else if (diceMove.contains("-")) {
            return diceMove.indexOf("-");
        }
        return 0;
    }

    private static int getNumOfSides(String diceMove, int diceSignIndex) {
        if (diceSignIndex != 0) {
            return Integer.parseInt(diceMove.substring(diceMove.indexOf('D') + 1, diceSignIndex));
        } else {
            return Integer.parseInt(diceMove.substring(diceMove.indexOf('D') + 1));
        }
    }

    private static int getNumOfThrows(String diceMove) {
        if (diceMove.indexOf('D') != 0) {
            return Integer.parseInt(diceMove.substring(0, diceMove.indexOf('D')));
        }
        return 1;
    }

}
