import java.util.Stack;

public class p73 {
    public static int evaluate(String expression) {
        char[] tokens = expression.toCharArray();
        Stack<Integer> values = new Stack<Integer>();
        Stack<Character> ops = new Stack<Character>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == ' ')
                continue;
            if (tokens[i] >= '0' && tokens[i] <= '9') {
                String str = "";
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
                    str += tokens[i++];
                values.push(Integer.parseInt(str));
                i--;
            } else if (tokens[i] == '(')
                ops.push(tokens[i]);
            else if (tokens[i] == ')') {
                while (ops.peek() != '(')
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                ops.pop();
            } else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/') {
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                ops.push(tokens[i]);
            }
        }
        while (!ops.empty())
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
        return values.pop();
    }

    public static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    public static int applyOp(char op, int b, int a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Evaluated Expressions are : ");
        System.out.println("10 + 2 * 6 : " + evaluate("10 + 2 * 6"));
        System.out.println("100 * 2 + 12 : " + evaluate("100 * 2 + 12"));
        System.out.println("100 * ( 2 + 12 ) : " + evaluate("100 * ( 2 + 12 )"));
        System.out.println("100 * ( 2 + 12 ) / 14 : " + evaluate("100 * ( 2 + 12 ) / 14"));
    }
}
