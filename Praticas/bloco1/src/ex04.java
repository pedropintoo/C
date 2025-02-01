/**
 * @ Author: Pedro Pinto (pmap@ua.pt)
 * @ Create Time: 2024-02-26
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex04 {
    
    static final Scanner input = new Scanner(System.in);
    static final Map<String,Integer> numbers_map = new HashMap<>();

    public static void main(String[] args) throws FileNotFoundException {

        fillMap("numbers.txt");

        while (input.hasNextLine()) {
            String line = input.nextLine().trim();
            String parts[] = line.replace("-"," ").split(" ");

            for (String str : parts) {
                Integer corrInteger = numbers_map.get(str);

                System.out.print(corrInteger == null ? str : corrInteger);
                System.out.print(" ");
            }
            System.out.println();
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
