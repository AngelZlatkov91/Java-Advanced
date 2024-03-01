package StreamsFilesDirectories.Exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines_01 {
    public static void main(String[] args) throws IOException {
         // 1. Всички редове от файл - input.txt
        // 2. за всеки ред сумата на аски кодовете

        String pathFile = "C:\\JavaAdvanced_02\\src\\StreamsFilesDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> allLines = Files.readAllLines(Path.of(pathFile));
        // 1 nachin
      //  for (String line : allLines) {
     //       int sum = 0;
     //       for (char symbol : line.toCharArray()) {
     //           sum +=symbol;
    //        }
     //       System.out.println(sum);
    //    }


        // 2 nacin
        allLines.forEach(arr -> {
                    int sum = 0;
                    for (char symbol : arr.toCharArray()) {
                        sum +=symbol;
                    }
                    System.out.println(sum);
                });










    }
}
