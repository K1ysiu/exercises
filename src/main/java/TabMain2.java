import java.util.Arrays;
import java.util.OptionalDouble;


public class TabMain2 {
    public static void main(String[] args) {
        double randNumbers[] = new double[20];
        int min = 0;
        int max = 100;
        for (int i = 0; i <= randNumbers.length - 1; i++) {
            randNumbers[i] = ((Math.random() * (max - min)) + min);
        }
        System.out.println(Arrays.stream(randNumbers).min());

    }
}
