/**
 * @ Author: Pedro Pinto (pmap@ua.pt)
 * @ Create Time: 2024-02-20
 */

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex01 {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {

        double result = 0;
        double n1 = 0;
        double n2 = 0;
        String operator = null;

        System.out.print("Operation (<number> <operator> <number>): ");

        if (!input.hasNextDouble()) {
            System.err.println("ERROR: read number failure\n");
            System.exit(1);
        } else {
            n1 = input.nextDouble();
        }
        
        if (input.hasNext()) {
            operator = input.next();
        }

        if (!input.hasNextDouble()) {
            System.err.println("ERROR: read number failure\n");
            System.exit(1);
        } else {
            n2 = input.nextDouble();
        }



        switch (operator) {
            case "+":
                result = n1+n2;
                break;
            case "-":
                result = n1-n2;
                break;
            case "/":
                result = n1/n2;
                break;
            case "*":
                result = n1*n2;
                break;
            default:
                System.err.println("<operator>, INVALID!");
                break;
        }

        System.out.printf("%f %s %f = %f\n",n1,operator,n2,result);
        input.close();
    }
}
