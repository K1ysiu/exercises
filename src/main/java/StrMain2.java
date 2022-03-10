

public class StrMain2 {
    public static void main(String[] args) {
//        String string = "Kobyła ma Mały bok";
        String string = "kajAk";

        String myPalindrom = string.replace(" ", "").toLowerCase();

        System.out.println(myPalindrom);
        System.out.println(checkPali(myPalindrom));
    }
    static boolean checkPali(String myPalindrom) {
        char myArray[] = myPalindrom.toCharArray();

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != myArray[myArray.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
