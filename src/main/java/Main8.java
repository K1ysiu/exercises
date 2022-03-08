public class Main8 {
    public static void main(String[] args) {
        int a = 112;
        int b = 13;
        int c = 2;
        System.out.println(maxOfThree(a,b,c));


    }
    static int maxOfThree(int a, int b, int c){
    int maxValue = Math.max(a, Math.max(b,c));
    return  maxValue;
    }

}
