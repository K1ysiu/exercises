import org.apache.commons.lang3.StringUtils;


public class ApacheCom {
    public static void main(String[] args) {
        String str = "J has a kat.";
        System.out.println(StringUtils.deleteWhitespace(str));
        System.out.println(StringUtils.reverse(str));
        System.out.println(StringUtils.swapCase(str));

    }

}
