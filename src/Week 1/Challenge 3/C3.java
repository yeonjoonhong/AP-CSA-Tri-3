import java.util.Scanner;

import src.Blueprint;
import src.Week3.Algorithms.BubbleSort;
import src.Week3.Algorithms.InsertionSort;
import src.Week3.Algorithms.MergeSort;
import src.Week3.Algorithms.SelectionSort;

public class C3 extends Blueprint {
    public Sorts(String optionTitle) {
        super(optionTitle);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Which sort algorithm would you like to see?\n1: Bubble Sort\n2: Selection Sort\n3: Insertion Sort\n4: Merge Sort");
        int algo = scanner.nextInt();

        // Simple switch statement to call the function for the specified algorithm
        switch (algo) {
            case 1:
                BubbleSort bubbleSort = new BubbleSort();
                bubbleSort.run();
                break;
            case 2:
                SelectionSort selectionSort = new SelectionSort();
                selectionSort.run();
                break;
            case 3:
                InsertionSort insertionSort = new InsertionSort();
                insertionSort.run();
                break;
            case 4:
                MergeSort mergeSort = new MergeSort();
                mergeSort.run();
                break;
        }
    }
}