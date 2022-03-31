import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class MainTest123 {

    private final static String PATH_DIRECTORY = "src/main/resources/";
    private static final Logger log = Logger.getLogger(MainTest123.class.getName());

    public static void main(String[] args) {

        fileExist(new File(PATH_DIRECTORY).listFiles());

    }
    private static boolean fileExist(File[] myFiles) {
        System.out.println("Type file name");
        Scanner scanner = new Scanner(System.in);
        String targetFile = scanner.nextLine();
        return Arrays.toString(myFiles).contains(targetFile);

    }



}


