package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteEveryThurdLine {
    public static void main(String[] args) throws FileNotFoundException {
        String pathRead = "C:\\JavaAdvanced_02\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathWriter = "C:\\JavaAdvanced_02\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Numbers.txt";

        FileInputStream inputStream = new FileInputStream(pathRead);
        FileOutputStream  outputStream = new FileOutputStream(pathWriter);

        Scanner reader = new Scanner(inputStream);
        PrintWriter writer = new PrintWriter(outputStream);
        int count = 1;
        String line = reader.nextLine();
        while (reader.hasNextLine()) {
            if (count % 3 == 0) {
                writer.println(line);
            }
            count++;
            line = reader.nextLine();
        }
        writer.close();
        reader.close();

    }
}
