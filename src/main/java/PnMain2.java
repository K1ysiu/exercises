import java.util.StringTokenizer;

public class PnMain2 {
    public static void main (String[] args){
        String str = "Ola.ma.kota";
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");

        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }


    }
}
