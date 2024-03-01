package SetAndMapsAdvanced.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, LinkedHashMap<String,Integer>> dataInfo = new TreeMap<>();


        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String ip = input.split("\\s+")[0].split("=")[1];
            String message = input.split("\\s+")[1].split("=")[1];
            String userName = input.split("\\s+")[2].split("=")[1];

            if (!dataInfo.containsKey(userName)) {
                dataInfo.put(userName,new LinkedHashMap<>());
            }
            if (!dataInfo.get(userName).containsKey(ip)) {
                dataInfo.get(userName).put(ip,0);
            }
            int currentValue = dataInfo.get(userName).get(ip);
            dataInfo.get(userName).put(ip,currentValue + 1);

            input = scanner.nextLine();
        }
        for (String userName : dataInfo.keySet()) {
            System.out.println(userName + ": ");
           Map<String, Integer> data = dataInfo.get(userName);
           int countIp = data.size();
            for (String ip : data.keySet()) {
                if (countIp == 1) {
                    System.out.print(ip + " => " + data.get(ip) + ".");
                } else {
                    System.out.print(ip + " => " + data.get(ip) + ", ");
                }
                countIp--;
            }
            System.out.println();
        }


    }
}
