public class CodeWars {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4};
        int myResult = 1;
        for (int i = 0; i < myArray.length; i++) {
            myResult = myResult * myArray[i] ;
        }
        System.out.println(myResult);

    }
}
