public class StrMain5 {
    public static void main(String[] args) {
        String myString = "Adam";
        char myChar = 'a';

        System.out.println(charPos(myString, myChar));
    }

    static int charPos(String str, char c) {
        char[] myCharString = str.toCharArray();
        int i = 0;
        for (i = 0; i < str.length(); i++) {
            if (myCharString[i] == c) {
                break;
            }
        }
        return i + 1;
    }
}
