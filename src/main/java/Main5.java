public class Main5 {
    public static void main(String[] args) {
        double gross = 2500;
        double vat = 0.16;
        System.out.println(calculateNet(gross, vat));

    }

    static double calculateNet(double gross, double vat) {
        return gross - (gross * vat);
    }
}
