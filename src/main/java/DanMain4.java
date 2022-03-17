import java.util.Arrays;
import java.util.Scanner;

public class DanMain4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("type number of rows: ");
        int cols = scanner.nextInt();
        int myNumber = 0;
        System.out.println(rows + ", " + cols);
        int myArray[][] = new int[rows][cols];
        int mySum = 0;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = myNumber++;
                mySum = mySum + myNumber;

                System.out.println(myArray[i][j]);

            }

        }
        System.out.println(mySum);
        System.out.println(rows * cols);
        System.out.println(mySum / (rows * cols));


    }
}
