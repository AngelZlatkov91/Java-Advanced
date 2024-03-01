package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoStream {
    public static void main(String[] args) throws IOException {
          String path = "C:\\Users\\USER\\Desktop\\Angel.txt";
          // път към файла от който чете информациа

        FileInputStream fileStream = new FileInputStream(path);
        //Създаваме поток да четем от файла
           int oneByte = fileStream.read();
           // read -> -1 файлъд е приключил
           while (oneByte >=0) {
               System.out.println(oneByte);
               oneByte = fileStream.read();
           }
          fileStream.close();
         // създаваме подот да пишем във файл
        FileOutputStream outputStream = new FileOutputStream(path);
    }
}
