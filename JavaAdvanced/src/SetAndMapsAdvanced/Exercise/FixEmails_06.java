package SetAndMapsAdvanced.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> dataEmail = new LinkedHashMap<>();


        String name = scanner.nextLine();
        while (!name.equals("stop")) {
            String email = scanner.nextLine();
            if (!email.endsWith("uk") && !email.endsWith("us") && !email.endsWith("com")) {
                dataEmail.put(name,email);
            }
            name = scanner.nextLine();
        }
        dataEmail.forEach((k,v) -> System.out.println(k + " -> " + v));
    }
}
