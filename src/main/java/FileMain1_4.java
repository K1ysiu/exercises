import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileMain1_4 {

    private static final String FOLDER_PATH1 = "src/main/resources/";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type file name:");
        String fileName = scanner.nextLine();
        File myFile = new File(FOLDER_PATH1 + fileName);

        if (isFileExist(myFile)) {
            System.out.println("Type text to write in file");
            String txtToWrite = scanner.nextLine();
            writeToFile(myFile, txtToWrite);
        }

    }

    private static void writeToFile(File myFile, String txtToWrite) throws IOException {
        FileWriter fileWriter = new FileWriter(myFile);
        fileWriter.write(txtToWrite);
        fileWriter.flush();
        fileWriter.close();
    }

    public static boolean isFileExist(File filePath) {
        try {
            if (filePath.createNewFile()) {
                System.out.println("File created: " + filePath.getName());
                return true;
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("File already exists.");
        return false;
    }
}
