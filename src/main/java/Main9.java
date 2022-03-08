public class Main9 {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    static long factorial(int n){

        int myNlength = n;
        long myTempVal = 1;
        // 1 1*1=1
        // 2 1*2=2
        // 3 2*3=6
        // 4 6*4=24
        // 5 24*5=120
        for (int i = 1; i <= myNlength; i++) {
            myTempVal = myTempVal * i;

        }
        return myTempVal;
    }
}
