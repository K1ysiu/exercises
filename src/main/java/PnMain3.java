public class PnMain3 {
    public static void main(String[] args) {
        String str = "Adam ma kota\n";
        System.out.println(countTokent(str));
    }

    static int countTokent(String str) {
        char[] myArray = str.toCharArray();
        int count = 0;
        for (char item : myArray) {
            if (!Character.isWhitespace(item)) {
                count++;
            }
        }
        return count;
    }
}
