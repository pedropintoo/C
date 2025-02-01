/**
 * @ Author: Pedro Pinto (pmap@ua.pt)
 * @ Create Time: 2024-02-27
 */

import java.util.Scanner;

public class ExpressionTree {

    private static Scanner in = new Scanner(System.in);

    private String root;
    private ExpressionTree leftExpression = null; 
    private ExpressionTree rightExpression = null;

    public void createPrefix() {

        if (in.hasNextDouble()) { // next word is a number
            // leaf tree with the number
            root = in.next();

        } else { // next word is the operator
            // tree with the form : operator leftExpression rightExpression
            root = in.next();
            if (!isValidOperator(root)) {
                ExpressionError();
            }

            // Generate left node
            leftExpression = new ExpressionTree();
            leftExpression.createPrefix();
            // Generate right node
            rightExpression = new ExpressionTree();
            rightExpression.createPrefix();
        }

    }

    public void printInfix() {
        
        // number is a leaf node
        if (!isValidOperator(root)) {
            System.out.print(root);
            return;
        }

        // left node
        if (isValidOperatorLessPriority(leftExpression.root)) {
            System.out.print("(");
            leftExpression.printInfix();
            System.out.print(")");
        } else {
            leftExpression.printInfix();
        }
        // current node
        System.out.print(" " + root + " ");
        
        // right node
        if (isValidOperatorLessPriority(rightExpression.root)) {
            System.out.print("(");
            rightExpression.printInfix();
            System.out.print(")");
        } else {
            rightExpression.printInfix();
        }
        
    }

    public int eval() {
        
        // number is a leaf node
        if (!isValidOperator(root)) {
            return Integer.parseInt(root);
        }

        // left node
        int leftResult = leftExpression.eval();
        int rightResult = rightExpression.eval();
        
        switch (root) {
            case "+":
                return leftResult + rightResult;
            case "-":
                return leftResult - rightResult;
            case "*":
                return leftResult * rightResult;
            case "/":
                return leftResult / rightResult;
            default:
                ExpressionError();
        }

        return 0;
    }

    private boolean isValidOperator(String operator) {
        return operator.equals("-") || operator.matches("[+*/]");
    }

    private boolean isValidOperatorLessPriority(String operator) {
        return operator.equals("-") || operator.equals("+");
    }

    private void ExpressionError() {
        System.err.println("Expression is invalid!");
        System.exit(1);
    }
}