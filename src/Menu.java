package src;

import src.week0.*;
import src.week1.*;
import src.week2.*;
import src.week3.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Driver.main(args);
    }
}


class Driver {
    public static void main(String[] args) {
        System.out.println("\nMain Menu: ");

        String selection;
        Scanner sc = new Scanner(System.in);
        Map<String, MenuRow> menu = new HashMap<>();
        menu.put("e", new MenuRow("Exit Application", null));
        menu.put("0", new MenuRow("Week 0", () -> Menu0.main(null)));
        menu.put("1", new MenuRow("Week 1", () -> Menu1.main(null)));
        menu.put("2", new MenuRow("Week 2", () -> Menu2.main(null)));
        menu.put("3", new MenuRow("Week 3", () -> Menu3.main(null)));


        for (Map.Entry<String, MenuRow> pair : menu.entrySet()) {
            System.out.println(pair.getKey() + " ==> " + pair.getValue().getName());
        }


        while (true) {

            try {
                selection = sc.nextLine();

                try {
                    MenuRow row = menu.get(selection);
                    if (row.getName().equals("Exit Application")) {
                        System.exit(0);
                    }
                    row.run();

                } catch (Exception e) {
                    System.out.printf("\nInvalid selection: %d \n\n", selection);
                }
            } catch (Exception e) {
                System.out.println("\nInput is not a number\n");
            }
            Driver.main(null);
        }
    }
}

class MenuRow {
    String title;
    Runnable action;

    public MenuRow(String title, Runnable action) {
        this.title = title;
        this.action = action;
    }

    public String getTitle() {
        return this.title;
    }
    public Runnable getAction() {
        return this.action;
    }

    public void run() {
        action.run();
    }

    public String getName() { return this.title; }
}