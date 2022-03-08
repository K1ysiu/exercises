import java.text.DecimalFormat;
import java.text.NumberFormat;

public class TabMain1 {
    public static void main(String[] args) {
        NumberFormat format = new DecimalFormat("00");
        int[] myArray = new int[50];
        int myJ = myArray.length / 10;
        for (int i = 0; i <= myArray.length - 1; i++) {
            myArray[i] = i;
            int myMod = i % 10;
            if (myMod == 0) {
                System.out.println("\n");
            }
            System.out.print(format.format(myArray[i]) + ", ");
        }
    }
}
