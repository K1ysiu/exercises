
public class ArrayReverse {
    public static void main(String[] args) {
        int[] myArray = {1, 3, 65, 23, 12};
        extracted(myArray);
    }


    private static void extracted(int[] myArray) {
        int[] reverse = new int[myArray.length];
        for (int i = myArray.length - 1; i >= 0; i--) {
            reverse[myArray.length - (myArray.length - i)] = myArray[i];
            System.out.println(reverse[i]);
        }
    }
}
