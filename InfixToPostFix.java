import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfixToPostFix {

   static Stack operators = new Stack();

   public static void main(String argv[]) throws IOException {
       String infix;

       // create an input stream object
       BufferedReader keyboard = new BufferedReader(new InputStreamReader(
               System.in));

       // get input from user
       System.out.print("\nEnter the algebraic expression in infix: ");
       infix = keyboard.readLine();
       String postFx = toPostfix(infix);
       // output as postfix
       System.out.println("The expression in postfix is:" + postFx);

       if (postFx.contains("x")) {
           String line = "";
           do {
               System.out.println("Enter value of X : ");
               line = keyboard.readLine();
               if (!"q".equalsIgnoreCase(line)) {
                   postFx = postFx.replaceAll("x", line);
                   System.out.println("Answer to expression : "
                           + EvaluateString.evaluate(postFx));
               }
           } while (!line.equals("q"));
       } else {
           System.out.println("Answer to expression : "
                   + EvaluateString.evaluate(postFx));
       }

   }

   private static String toPostfix(String infix)
   // converts an infix expression to postfix
   {
       char symbol;
       String postfix = "";

       for (int i = 0; i < infix.length(); ++i)
       // while there is input to be read
       {
           symbol = infix.charAt(i);
           // if it's an operand, add it to the string
           if (symbol != ' ') {
               if (Character.isLetter(symbol) || Character.isDigit(symbol))
                   postfix = postfix + " " + symbol;
               else if (symbol == '(')
               // push (
               {
                   operators.push(symbol);
               } else if (symbol == ')')
               // push everything back to (
               {
                   while (operators.peek() != '(') {
                       postfix = postfix + " " + operators.pop();
                   }
                   operators.pop(); // remove '('
               } else
               // print operators occurring before it that have greater
               // precedence
               {
                   while (!operators.isEmpty() && !(operators.peek() == '(')
                           && prec(symbol) <= prec(operators.peek()))
                       postfix = postfix + " " + operators.pop();

                   operators.push(symbol);
               }
           }
       }
       while (!operators.isEmpty())
           postfix = postfix + " " + operators.pop();
       return postfix.trim();
   }

   static int prec(char x) {
       if (x == '+' || x == '-')
           return 1;
       if (x == '*' || x == '/' || x == '%')
           return 2;
       return 0;
   }
}