package StreamsFilesDirectories.Exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumBytes_02 {
    public static void main(String[] args) throws IOException {

        String pathFile = "C:\\JavaAdvanced_02\\src\\StreamsFilesDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        List<String> allLines = Files.readAllLines(Path.of(pathFile));

       long allSum = 0;


        for (String line : allLines) {
            for (char symbol : line.toCharArray()) {
                allSum+= symbol;
            }
        }
        System.out.println(allSum);





    }
}
