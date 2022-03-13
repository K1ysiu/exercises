import java.util.Arrays;

public class PnMain4 {
    public static void main(String[] args) {
        String myStr = "Java-tasks-to-do";
        char mySep = '-';
        System.out.println(Arrays.toString(onlyTwoElements(myStr, mySep)));

    }

    static String[] onlyTwoElements(String str, char separator) {
        String[] myArray = new String[2];
        myArray[0] = str.substring(0, str.indexOf(separator));
        myArray[1] = str.substring(str.indexOf(separator) + 1);
        return myArray;
    }

}
