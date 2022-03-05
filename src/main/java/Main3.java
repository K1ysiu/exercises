import java.text.DecimalFormat;

public class Main3 {
    private static final DecimalFormat decimalFormat = new DecimalFormat("0.000");
    public static void main(String[] args) {
        System.out.println(decimalFormat.format(convertToUsd(1)) );
        }
        static double convertToUsd(double zlotys){
        return zlotys/4.04 ;
        }
    }

