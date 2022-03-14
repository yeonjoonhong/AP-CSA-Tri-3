import java.util.HashMap;

public class Matrix extends Blueprint {
    HashMap<Integer, String> hexValues = new HashMap<Integer, String>();

    public Matrix(String optionTitle) {
        super(optionTitle);

        hexValues.put(10, "a");
        hexValues.put(11, "b");
        hexValues.put(12, "c");
        hexValues.put(13, "d");
        hexValues.put(14, "e");
        hexValues.put(15, "f");
    }

    // declare and initialize a matrix for a keypad
    private static int[][] keypad() {
        return new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { -1, 0, -1 } };
    }

    // declare and initialize a random length arrays
    private static int[][] numbers() {
        return new int[][] { { 0, 1 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 } };
    }

    private void print(int[][] m) {
        System.out.println();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] != -1 && m[i][j] < 10)
                    System.out.print(m[i][j]);
                else if (m[i][j] > 9)
                    System.out.print(hexValues.get(m[i][j]));
                else
                    System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = m.length - 1; i >= 0; i--) {
            for (int j = m[i].length - 1; j >= 0; j--) {
                if (m[i][j] != -1 && m[i][j] < 10)
                    System.out.print(m[i][j]);
                else if (m[i][j] > 9)
                    System.out.print(hexValues.get(m[i][j]));
                else
                    System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void run() {
        print(keypad());
        print(numbers());
    }

}