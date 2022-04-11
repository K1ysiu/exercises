import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static model.Constants.FOLDER_PATH;

public class PopularWords {
    public static void main(String[] args) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FOLDER_PATH + "adam.txt"));
            Connection connect = Jsoup.connect("http://www.onet.pl/");
            List<String> forbidenWords = Arrays.asList("Zażyłe", "relacje");

            try {
                Document document = connect.get();
                Elements links = document.select("span.title");
                List<String> spanWords = new ArrayList<String>();
                for (Element elem : links) {
                    for (String word : elem.text().split(" ")) {
                        if(word.length() > 3 && !forbidenWords.contains(word)){
                            writer.write(word + "\n");
                        }
                    }
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
