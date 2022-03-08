import java.util.Arrays;

public class TabMain6 {
    public static void main(String[] args) {
        int numbers[] = {1, 3, 65, 23, 12};
        int secondNumbers[] = {1, 3, 65, 23, 12};
        int sumArrays[] = new int[numbers.length];

        for (int i = 0; i <= numbers.length - 1; i++) {
            sumArrays[i] = numbers[i] + secondNumbers[i];
        }
        System.out.println(Arrays.toString(sumArrays));
    }
}
