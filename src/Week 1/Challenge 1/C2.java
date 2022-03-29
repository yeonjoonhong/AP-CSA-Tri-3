import java.util.Scanner;
import java.util.Arrays;
import Challenge2.imports.Calculator;

public class Challenge2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------\n");
        System.out.println("Choose an option:");
        System.out.println("1 - No Input (Test Data)");
        System.out.println("2 - User Input (Your Data)");
        System.out.println("-------------------------\n");

        int op1;
        op1 = scan.nextInt();
        if(op1 == 1) {
            System.out.println("Test: ( 3*(SQRT 2) ^3 )");
            Calculator calculator = new Calculator(" ( 3*(SQRT 2) ^3 )");
            System.out.println(calculator.toString());
        } else {
            System.out.println("-------------------------\n");
            System.out.println("Please include parenthesis () ");
            System.out.println("-------------------------\n");

            Scanner scan2 = new Scanner(System.in);

            try {
                String op2 = scan2.nextLine();
                Calculator calculator = new Calculator(op2);
                System.out.println(calculator.toString());

            } catch (Exception error) {
                System.out.println("Remember to use parentheses.");
                System.exit(0);
            }

        }

    }
}