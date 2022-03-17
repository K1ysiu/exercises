import org.apache.commons.collections4.list.SetUniqueList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DarSolution {
    public static void main(String[] args) {

        String string = "AAAABBBCHHHHHHHAA";

        countLetters(string);

    }

    public static String countLetters(String string) {

        List<String> list = new ArrayList<>(Arrays.asList(string.split("")));
        List<String> listToBeChanged = new ArrayList<>(Arrays.asList(string.split("")));

        SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(listToBeChanged);

        StringBuffer sb = new StringBuffer();

        int count = 0;

        for (String uniqueLetter : uniqueList) {
            for (String countedLetter : list) {
                if (uniqueLetter.equals(countedLetter)) {
                    count++;
                }
            }
            sb.append(uniqueLetter).append(count);
            count = 0;
        }
        return sb.toString();
    }
}