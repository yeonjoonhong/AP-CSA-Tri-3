import src.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main { // Everything in Java is inside a class, Squigs, Squigalies, or Curly brackets
    // denote a code block in Java. This is the beginning of class code block.

    /**
     * main - entry point method for this project
     * main is the entry or pri·mor·di·al code block for Java
     */

    static public void main(String[] args) { // open squig begins the method
        ArrayList<Blueprint> options = new ArrayList<Blueprint>();
        options.add(new Sample("sample"));
        options.add(new Sample("sample2"));
        options.add(new Swap("swap"));
        options.add(new Matrix("matrix"));
        options.add(new Exit("exit"));

        while (true) {
            menu(options);
        }
    } // close squig ends the method. What did this method do?

    /**
     * menu - method that is activated by main, this will perform Java code
     */
    public static void menu(ArrayList<Blueprint> options) {
        System.out.println("Please choose something");
        for (int i = 0; i < options.size(); i++)
            System.out.println("Option " + (int) (i + 1) + ": " + options.get(i).getTitle());

        Scanner scanner = new Scanner(System.in);
        try {
            int choice = scanner.nextInt();
            options.get(choice - 1).run();
            System.out.println();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }

        if (scanner != null)
            scanner.close();
    }

}