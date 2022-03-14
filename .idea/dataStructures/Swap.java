import java.util.Scanner;

public class Swap extends Blueprint {
    public Swap(String optionTitle) {
        super(optionTitle);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter 2 numbers to demonstrate swap");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println("BEFORE: a is: " + a + " b is: " + b);
            int temp = b;
            b = a;
            a = temp;
            System.out.println("AFTER: a is: " + a + " b is: " + b);
        } catch (Exception e) {
            System.out.println("Invalid input, try again");
            run();
        }

    }
}