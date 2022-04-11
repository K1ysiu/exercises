public class StringSubstring {
    public static void main(String[] args) {

        String myString = "CodersLab";
        System.out.println(firstHalf(myString));
    }

    static String firstHalf(String str) {
        int myLength = str.length();
        if (myLength % 2 == 0) {
            return str.substring(0, myLength / 2);
        } else {
            return str.substring(0, (myLength - 1) / 2);
        }
    }
}
