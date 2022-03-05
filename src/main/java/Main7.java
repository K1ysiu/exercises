public class Main7 {
    public static void main(String[] args) {
        int number = 2;
        System.out.println(checkEven(1));
    }

    static String checkEven(int number) {
        double myModulo = number % 2;
        if (myModulo == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

}
