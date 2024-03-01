package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExtractInteger_04 {
    public static void main(String[] args) throws FileNotFoundException {
        String patRead = "C:\\JavaAdvanced_02\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream inputStream = new FileInputStream(patRead);
      Scanner scanner  = new Scanner(inputStream);

      //hasNext -> true ako imame sledvhasht red
        // fasle ako sme stignali kraq
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
              int number = scanner.nextInt();
                System.out.println(number);
            }
            scanner.next();
        }



    }
}
