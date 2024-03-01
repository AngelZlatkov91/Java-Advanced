package StreamsFilesDirectories;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFile_02 {
    public static void main(String[] args) throws IOException {
        String pathRead = "C:\\JavaAdvanced_02\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        String patWrite = "C:\\JavaAdvanced_02\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\Output_task_02";

        FileInputStream inputStream = new FileInputStream(pathRead);
        FileOutputStream outputStream = new FileOutputStream(patWrite);

        int currentByte = inputStream.read();
        while (currentByte >=0) {
            char currentSymbol = (char) currentByte;
            if (currentSymbol != '.'&& currentSymbol != ',' && currentSymbol != '!' && currentSymbol != '?') {
                outputStream.write(currentSymbol);
            }
            currentByte = inputStream.read();
        }
        inputStream.close();
        outputStream.close();



    }
}
