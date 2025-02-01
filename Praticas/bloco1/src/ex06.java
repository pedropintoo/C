/**
 * @ Author: Pedro Pinto (pmap@ua.pt)
 * @ Create Time: 2024-02-27
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Running example: java ex06 ../data/dic2.txt ../data/texto2.txt  ../data/texto1.txt

public class ex06 {
    static Scanner input;
    static final Map<String,String> string_map = new HashMap<>();

    // Incomplete
    public static void main(String[] args) throws FileNotFoundException {

        fillMapWithDictionary(args[0]);

        for (int i = 1; i < args.length; i++) {
            input = new Scanner(new FileReader(args[i]));
            while (input.hasNextLine()) {
                String line = input.nextLine().trim();
                String parts[] = line.split(" ");
    
                for (String str : parts) {
                    String respectiveTranslation = getOnlyUndefinedWords(str);

                    System.out.print(respectiveTranslation == null ? str : respectiveTranslation);      
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        
    }

    private static String getOnlyUndefinedWords(String strToTranslate) {
        if (strToTranslate == null) return null;

        String translation = string_map.get(strToTranslate);
        
        // is Undefined? If yes, return it!
        if (translation == null) {
            return strToTranslate;
        }

        String[] listTranslation = translation.split(" ");
        String result = "";

        // max depth reached so return the undefined word
        if (listTranslation.length == 1) {
            return translation;
        }

        // start depth search
        for (String str : listTranslation) {
            result = result.concat(getOnlyUndefinedWords(str)+" ");
        }

        return result.trim();
    }

    private static void fillMapWithDictionary(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader(filename));
        
        while (sc.hasNextLine()) {
            // Integer - number 
            String line = sc.nextLine().trim();
            
            String known_word = line.split(" ")[0];

            int splitIdx = line.indexOf(" ");
            String translated_word = line.substring(splitIdx+1).trim();

            string_map.put(known_word, translated_word);
        }

        sc.close();
    }

}
