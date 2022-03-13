import java.util.Arrays;


public class StrMain1dodatkowe {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("podaj ciąg znaków");
//        String myString = scanner.nextLine();
        String myString = "AAEEEEEDHH";
        char myArray[] = myString.toCharArray();
        int n = myArray.length;
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));


        for (int i = 0; i<n; i++){
            if (visited[i]==true)
                continue;
            int count = 1;
            for(int j = i + 1; j < n ; j++){
                if(myArray[i] == myArray[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.print(myArray[i] + "" + count);
        }


    }
}
