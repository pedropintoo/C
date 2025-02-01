/**
 * @ Author: Pedro Pinto (pmap@ua.pt)
 * @ Create Time: 2024-02-20
 */

import java.util.Scanner;
import java.util.Stack;

public class ex03 {

    static final Scanner input = new Scanner(System.in);
    static final Stack<Double> numbers_stack = new Stack<>();

    public static void main(String[] args) {
        double result = 0;

        while (input.hasNextLine()) {
            if (input.hasNextDouble()){
                numbers_stack.push(input.nextDouble());
            } else {
                if (numbers_stack.size() < 2) {
                    System.err.println("ERROR: one operand missing!");
                    System.exit(1);
                }

                String op = input.next();
                switch (op) {
                    case "+": result = numbers_stack.pop() + numbers_stack.pop(); break;
                    case "-": result = numbers_stack.pop() - numbers_stack.pop(); break;
                    case "*": result = numbers_stack.pop() * numbers_stack.pop(); break;
                    case "/": result = numbers_stack.pop() / numbers_stack.pop(); break;
                    
                    default:
                        System.err.printf("ERROR: invalid operator \"%s\"\n", op);
                        System.exit(1);
                }
                numbers_stack.push(result);
            }
            System.out.println("Stack: "+numbers_stack);
        }

        System.out.println("Result: "+result);
        input.close();
    }
}
