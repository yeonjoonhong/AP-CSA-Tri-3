package src.week3.sorts;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;

public class BubbleSorts {
    private static ArrayList<Integer> input = new ArrayList<Integer>();

    public BubbleSorts(ArrayList<Integer> input){
        BubbleSorts.input = input;
    }

    public static ArrayList<Integer> getInput() {
        return input;
    }

    public static void bubblesort(ArrayList<Integer> input)
    {
        int temp;
        if (input.size()>1) // check if the number of orders is larger than 1
        {
            for (int x=0; x<input.size(); x++) // bubble sort outer loop
            {
                for (int i=0; i < input.size()-i; i++) {
                    if (input.get(i).compareTo(input.get(i+1)) > 0)
                    {
                        temp = input.get(i);
                        input.set(i,input.get(i+1) );
                        input.set(i+1, temp);
                    }
                }
            }
        }
    }


    public static void sort(ArrayList<Integer> a) {
        BubbleSorts bs = new BubbleSorts(a);
    }
}