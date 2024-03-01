package StreamsFilesDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines_06 {
    public static void main(String[] args) throws IOException {

        Path pathRead = Paths.get("C:\\JavaAdvanced_02\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");

          Path pathWrite = Paths.get("C:\\JavaAdvanced_02\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\output.txt");
        List<String> allLines = Files.readAllLines(pathRead);
        Collections.sort(allLines);
        Files.write(pathWrite,allLines);








    }
}
