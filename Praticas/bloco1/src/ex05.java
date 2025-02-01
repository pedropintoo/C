/**
 * @ Author: Pedro Pinto (pmap@ua.pt)
 * @ Create Time: 2024-02-27
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex05 {
    static final Scanner input = new Scanner(System.in);
    static final Map<String,Integer> numbers_map = new HashMap<>();

    public static void main(String[] args) throws FileNotFoundException {

        fillMap("numbers.txt");

        while (input.hasNextLine()) {
            String line = input.nextLine().trim();
            String parts[] = line.replace("-"," ").split(" ");

            int accumulated = 0;
            int result = 0;

            for (String str : parts) {

                Integer currInteger = numbers_map.get(str);

                if (currInteger == null) continue;

                if (currInteger > accumulated) {
                    if (accumulated == 0) {
                        accumulated = currInteger;
                    } else {
                        accumulated *= currInteger;
                    }
                } else {
                    result += accumulated;
                    accumulated = currInteger;
                }

            }
            result += accumulated;

            System.out.println(line + "-> " + result);
        }
    }

    private static void fillMap(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader(filename));
        
        while (sc.hasNextLine()) {
            // Integer - number 
            String line = sc.nextLine().trim();
            String[] parts = line.split(" - ");
            
            String name = parts[1];
            Integer number = Integer.valueOf(parts[0]);

            numbers_map.put(name, number);
        }

        sc.close();
    }
}
