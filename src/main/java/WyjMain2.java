public class WyjMain2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        double c;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("you cant divide by 0");
            System.out.println(e.getMessage());
        }
    }
}
