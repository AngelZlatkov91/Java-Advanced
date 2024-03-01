package StreamsFilesDirectories;

import java.io.*;
import java.util.Scanner;

public class DemoFileReaderFileWriter {
    public static void main(String[] args) throws IOException {
       String path = "C:\\JavaAdvanced_02\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        // четеш от файл симбол по симбол
        Scanner scanner = new Scanner(inputStream);
        String firstROw = scanner.nextLine();
        String secondROw = scanner.nextLine();

        System.out.println(firstROw);
        String outPath = "C:\\JavaAdvanced_02\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\Output_task_02";
        FileOutputStream outputStream = new FileOutputStream(outPath);
         // чете от един файл и ги прехвърля на друг
        PrintWriter writer = new PrintWriter(outPath);
          writer.println(firstROw);
          writer.println(secondROw);

          inputStream.close();
          outputStream.close();
              writer.close();
    }
}
