import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Calculator {

    String input;
    ArrayList<String> tokenList;
    ArrayList<String> rpn;
    Double output;

    // hashmap for all operators by importance (precendence)
    private final Map<String, Integer> OPERATORS = new HashMap<>(); {
        // <token, precedence>
        OPERATORS.put("*", 3);
        OPERATORS.put("/", 3);
        OPERATORS.put("%", 3);
        OPERATORS.put("+", 4);
        OPERATORS.put("-", 4);
        OPERATORS.put("^", 2);
        OPERATORS.put("SQRT", 1);
    }

    // hashmap for all separators of the expression
    private final Map<String, Integer> SEPARATORS = new HashMap<>(); {
        SEPARATORS.put(" ", 0);
        SEPARATORS.put("(", 0);
        SEPARATORS.put(")", 0);
    }

    // checks if it's an operator
    private boolean isOperator(String token) {
        return OPERATORS.containsKey(token);
    }

    // checks if it's a separator
    private boolean isSeperator(String token) {
        return SEPARATORS.containsKey(token);
    }

    // evaluates priority of the operator
    private Boolean isPrecedent(String token1, String token2) {
        // if token 1 is greater, it takes precedence
        return (OPERATORS.get(token1) - OPERATORS.get(token2) >= 0) ;
    }

    public Calculator(String expression) {
        input = expression;

        // parses expression + puts into rpn
        this.termTokenizer();
        this.tokensToReversePolishNotation();

        // calculate rpn
        this.rpnToResult();
    }

    // converts tokens to rpn (operator, then operands)
    private void tokensToReversePolishNotation () {
        this.rpn = new ArrayList<>();

        // reorders stack based on precedence
        Stack tokenStack = new Stack();
        for (String token : tokenList) {
            switch (token) {
                // If left bracket push token on to stack
                case "(":
                    tokenStack.push(token);
                    break;
                case ")":
                    while (tokenStack.peek() != null && !tokenStack.peek().equals("("))
                    {
                        rpn.add( (String)tokenStack.pop() );
                    }
                    tokenStack.pop();
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "%":
                case "^":
                case "SQRT":

                    while (tokenStack.peek() != null && tokenStack.size() > 0 && isOperator((String) tokenStack.peek()))
                    {
                        if ( isPrecedent(token, (String) tokenStack.peek() )) {
                            rpn.add((String)tokenStack.pop());
                            continue;
                        }
                        break;
                    }
                    // Push the new operator on the stack
                    tokenStack.push(token);
                    break;
                default:    // Default should be a number, there could be test here
                    this.rpn.add(token);
            }
        }
        // Empty remaining tokens
        while ( tokenStack.size() > 0 && tokenStack.peek() != null) {
            rpn.add((String)tokenStack.pop());
        }

    }

    // Term Tokenizer takes original expression and converts it to ArrayList of tokens
    private void termTokenizer() {
        // contains final list of tokens
        this.tokenList = new ArrayList<>();

        int start = 0;  // term split starting index
        StringBuilder multiCharTerm = new StringBuilder();    // term holder
        for (int i = 0; i < this.input.length(); i++) {
            Character c = this.input.charAt(i);
            if ( isOperator(c.toString() ) || isSeperator(c.toString())  ) {
                // 1st check for working term and add if it exists
                if (multiCharTerm.length() > 0) {
                    tokenList.add(this.input.substring(start, i));
                }
                // Add operator or parenthesis term to list
                if (c != ' ') {
                    tokenList.add(c.toString());
                }
                // Get ready for next term
                start = i + 1;
                multiCharTerm = new StringBuilder();
            } else {
                // multi character terms: numbers, functions, perhaps non-supported elements
                // Add next character to working term
                multiCharTerm.append(c);
            }

        }
        // Add last term
        if (multiCharTerm.length() > 0) {
            tokenList.add(this.input.substring(start));
        }
    }

    // Takes RPN and produces a final result
    private void rpnToResult(){
        Stack calculation;
        calculation  = new Stack();

        // Declared peeks (via Stack)
        Object pk1 = null;
        Object pk2  = null;


        for(int i = 0; i < rpn.size(); i++) {
            // if token is a number, check if key contains an operator of the original hashmap
            // if it doesn't, keep going because token is number
            if(!(OPERATORS.containsKey(rpn.get(i)))) {
                // push value to stack
                calculation.push(Double.parseDouble(rpn.get(i)));
            } else {
                if(OPERATORS.get(rpn.get(i)) == 1 ) {
                    // pk1 is first peek when location is 0, then removes object from stack
                    pk1 = calculation.peek();
                    calculation.pop();
                } else if(OPERATORS.get(rpn.get(i)) > 1) {
                    pk1 = calculation.peek();
                    calculation.pop();

                    pk2 = calculation.peek();
                    calculation.pop();

                }

                Double convertedInitialPeek = (Double)(pk1);
                Double convertedSecondaryPeek = (Double)(pk2);

                if(rpn.get(i).equals("+")) {
                    calculation.push((convertedInitialPeek) + (convertedSecondaryPeek));
                } else if (rpn.get(i).equals("-"))   {
                    calculation.push((convertedSecondaryPeek) - (convertedInitialPeek));
                } else if (rpn.get(i).equals("*")) {
                    calculation.push((convertedInitialPeek) * (convertedSecondaryPeek));
                } else if (rpn.get(i).equals("/")) {
                    calculation.push((convertedSecondaryPeek) / (convertedInitialPeek));
                } else if (rpn.get(i).equals("%")) {
                    calculation.push((convertedSecondaryPeek) % (convertedInitialPeek));
                } else if (rpn.get(i).equals("^")) {
                    calculation.push(Math.pow(convertedSecondaryPeek, convertedInitialPeek));
                } else if (rpn.get(i).equals("SQRT")) {
                    calculation.push(Math.sqrt(convertedInitialPeek));
                }

            }

        }
        output = (Double) calculation.peek();
        calculation.pop();
    }


    // Print the expression, terms, and result
    public String toString() {
        return ("Original expression: " + this.input + "\n" +
                "Tokenized expression: " + this.tokenList.toString() + "\n" +
                "Reverse Polish Notation: " +this.rpn.toString() + "\n" +
                "Final result: " + String.format("%.2f", this.output));
    }


}