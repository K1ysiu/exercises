import java.util.StringTokenizer;

public class StringTokenizerPrint {
    public static void main(String[] args) {
        String text = "aaa bbb ccc";
        StringTokenizer sToken = new StringTokenizer(text);

        while (sToken.hasMoreTokens()) {
            System.out.println(sToken.nextToken());
            System.out.println(sToken.hashCode());
        }
    }
}
