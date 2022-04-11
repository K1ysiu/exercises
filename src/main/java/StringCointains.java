public class StringCointains {
    public static void main(String[] args) {
        String myString = "CodersLab";
        String mySearch = "ers";

        System.out.println(containsStr(myString, mySearch));

    }

    static boolean containsStr(String str, String search) {
        return str.contains(search);
    }

}
