package StreamsFilesDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DemoPath {
    public static void main(String[] args) throws IOException {
        //
        Path inPath = Paths.get("C:\\JavaAdvanced_02\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        Path outPath = Paths.get("C:\\JavaAdvanced_02\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Numbers.txt");

        //readAllLines - дава списък с редовете
        List<String> lines = Files.readAllLines(inPath);
        Files.write(outPath, lines);


    }
}
