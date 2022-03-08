import java.util.Arrays;


public class StrMain1dodatkowe {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("podaj ciąg znaków");
//        String myString = scanner.nextLine();
        String myString = "AAEEEEEDHH";
        char myArray[] = myString.toCharArray();
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
        int len = myArray.length;
        int count = 0;
        char[] distArray = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            int flag = 0;
            for (int j = 0; j < i; j++) {
                if (myArray[i] == myArray[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                distArray[index] = myArray[i];
                index++;
            }

        }
        for (char x: distArray) {
            for (char y : myArray) {
                if (x == y) {
                    count++;

                }
                System.out.println(x + count);
            }
        }


    }
}
