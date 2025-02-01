/**
 * @ Author: Pedro Pinto (pmap@ua.pt)
 * @ Create Time: 2024-03-01
 */

public class ex07 {
    
    // Miss the validation!
    public static void main(String[] args) {
        ExpressionTree mainNode = new ExpressionTree();
        mainNode.createPrefix();
        mainNode.printInfix(); 
        System.out.println(" = " + mainNode.eval());
    }

}
