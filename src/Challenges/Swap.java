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

            IntByReference.swapper(21, 16);
        } catch (Exception e) {
            System.out.println("Invalid input, try again");
            run();
        }
        public static void swapper(int n0, int n1) {
        IntByReference a = new IntByReference(n0);
        IntByReference b = new IntByReference(n1);
        System.out.println("Before: " + a + " " + b);
        swapToLowHighOrder(a, b);  // conditionally build swap method to change values of a, b
        System.out.println("After: " + a + " " + b);
        System.out.println();
        }
        public static void swapToLowHighOrder(IntByReference a,IntByReference b) {
        int num1 = a.value;
        int num2 = b.value;
        if (num2>num1) {
        a.value = num2;
        b.value = num1;
        }
        public IntByReference(int n) {
        this.value = n;
        }
        public String toString(){//overriding the toString() method
        return ""+value;
        }
    }
