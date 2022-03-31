
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class FileMain5 {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("src/main/resources/txt2.txt");
            BufferedReader reader = new BufferedReader(fr);

            ArrayList<String> str = new ArrayList<>();
            String line = "";
            Collections.sort(str);

            try {
                while((line = reader.readLine())!=null){
                 str.add(line);

                }

                System.out.println(str);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
