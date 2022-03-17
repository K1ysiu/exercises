import org.junit.Assert;
import org.junit.Test;

public class Test1 {

    private String string = "AAAABBBCHHHHHHHAA";
    private String resultString = "A6B3C1H7";

    @Test
    public void demoTest(){
        String result = DarSolution.countLetters(string);
        Assert.assertEquals(result, resultString);
    }

}
