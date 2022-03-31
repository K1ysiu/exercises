import java.io.*;
import java.util.List;
import java.util.Scanner;

import static model.Constants.*;

public class FileMain1_5 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type file name");
        String txtfileName = scanner.nextLine();

        if (checkFileExist(FOLDER_PATH, txtfileName + ".txt")) {
            String htmlFile = FOLDER_PATH + txtfileName + ".html";

            if (!checkFileExist(FOLDER_PATH, txtfileName)) {
                createHtmlFile(htmlFile);
            }
        }
    }

    public static boolean checkFileExist(String folderPath, String fileName) {
        return new File(folderPath + fileName).exists();
    }



    public static void createHtmlFile(String newHtmlFile) throws IOException {
        String myHtmlPath = newHtmlFile;
        File htmlFile = new File(myHtmlPath);
        if (htmlFile.createNewFile()) {
            System.out.println("New file " + newHtmlFile + " was created.");
        } else {
            System.out.println("New file has not been created");
        }
    }

    public static void writeHtmlFile(File firstFile) {
        try {
            PrintWriter writer = new PrintWriter(firstFile);

            writer.write("<html>");
            writer.write("<body>");
            writer.write("<p>first</p>");
            writer.write("<p>second</p>");
            writer.write("</body>");
            writer.write("</html>");


            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
