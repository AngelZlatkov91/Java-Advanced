package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile_01 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\JavaAdvanced_02\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        int currentByt = inputStream.read();
        while (currentByt >= 0) {
            System.out.print(Integer.toBinaryString(currentByt) + " ");
            currentByt = inputStream.read();
        }
        inputStream.close();







    }
}
