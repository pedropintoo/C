/**
 * @ Author: Pedro Pinto (pmap@ua.pt)
 * @ Create Time: 2024-02-20
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex02 {
    
    static final Scanner input = new Scanner(System.in);
    static final Map<String,Double> vars_map = new HashMap<String,Double>();

    public static void main(String[] args) {
        while (input.hasNextLine()) {
            Scanner sc = new Scanner(input.nextLine());
            if (sc.hasNext())
                System.out.println("result = " + processExpression(sc));
            sc.close();    
        }
    }

    public static boolean isNumber(String token) {
        // NOT OPTIMIZED
        Scanner sc = new Scanner(token);
        boolean res = sc.hasNextDouble();
        sc.close();
        return res;
    }

    public static boolean isVar(String token) {
        boolean res = token.length() > 0 && Character.isLetter(token.charAt(0));
        
        for (int i = 1; res && i < token.length(); i++) {
            res = Character.isLetterOrDigit(token.charAt(i));
        }

        return res;
    }

    public static double processExpression(Scanner line) {
        
        double n1 = 0;
        double result = 0;

        String input = null;
        input = line.next();

        if (isVar(input)) {
            if (vars_map.containsKey(input)) {
                n1 = vars_map.get(input);
            }
        } else if (isNumber(input)) {
            n1 = Double.parseDouble(input);
        } else {
            System.err.printf("ERROR: invalid number \"%s\"\n",n1);
            System.exit(1);
        }

        if (line.hasNext()) {
            String op;
            op = line.next();

            if (op.equals("=")) {
                if (!isVar(input)){
                    System.err.println("ERROR: invalid assignment\n");
                    System.exit(1);
                }
                result = processExpression(line);
                vars_map.put(input,result);
            } else {
                double n2 = processExpression(line);
                switch (op) {
                    case "+": result = n1 + n2; break;
                    case "-": result = n1 - n2; break;
                    case "*": result = n1 * n2; break;
                    case "/": result = n1 / n2; break;
                    default:
                        System.err.printf("ERROR: invalid operator \"%s\"\n",op);
                        System.exit(1);
                }
            }

        } else {
            result = n1;
        }

        return result;

    }   
}
