package StreamsFilesDirectories.Exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AllCapitals_03 {
    public static void main(String[] args) throws IOException {
        String pathFile = "C:\\JavaAdvanced_02\\src\\StreamsFilesDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        List<String> allLines = Files.readAllLines(Path.of(pathFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\JavaAdvanced_02\\src\\StreamsFilesDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt"));
        for (String line : allLines) {
            writer.write(line.toUpperCase());
            writer.newLine();
        }

        writer.close();





    }
}
