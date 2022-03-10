import java.util.Arrays;

public class StrMain4 {
    public static void main(String[] args) {
        String str = "Tak";

        System.out.println(toogleChar(str));
    }

    static String toogleChar(String str) {
        char[] myArray = str.toCharArray();
        char myOutputArray[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(myArray[i])) {
                myOutputArray[i] = Character.toLowerCase(myArray[i]);
            } else {
                myOutputArray[i] = Character.toUpperCase(myArray[i]);
            }

        }
        StringBuilder myOutput = new StringBuilder();
        for (int j = 0; j < myOutputArray.length; j++) {
            myOutput.append(myOutputArray[j]);
        }
        return String.valueOf(myOutput);
    }
}
