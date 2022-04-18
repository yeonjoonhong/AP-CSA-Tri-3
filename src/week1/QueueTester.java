package src.week1;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class QueueTester {
    private static int count = 1; // number of objects in queue
    public static void main(String[] args) {
        // Create iterable Queue of Words
        Object[] words = new String[] { "seven", "slimy", "snakes", "sallying", "slowly", "slithered", "southward"};

        // Enqueue Data
        Queue<String> data = new LinkedList<String>();
        // enhanced for loop over String array named words
        for (Object x : words) {
            // print out current word on current index
            System.out.println("\nEnqueued Data: " + x);
            // print count and add one for next count representing index
            System.out.print("Words Count: " + count++);
            // add current word on current index to data String
            data.add(x.toString());
            // Print current information within data String LinkedList
            System.out.println(", Data: " + data
                    // turn LinkedList into a String format and replace brackets with nothing
                    .toString()
                    .replaceAll("\\[|\\]", ""));
        }

        // Dequeue Data
        // Starting index value
        int index = 6;
        // reverse enhanced for loop over String array named words
        for (Object x : words) {
            // print out current word on current index
            System.out.println("\nDequeued Data: " + x);
            // print count and remove one for next index representing index in LinkedList
            System.out.print("Words Count: " + index--);
            // deletes last in as the first out(LIFO) of LinkedList
            data.poll();
            // print data LinkedList
            System.out.println(", Data: " + data
                    // turn LinkedList into a String format and replace brackets with nothing
                    .toString()
                    .replaceAll("\\[|\\]", ""));
        }

        System.out.println("\n");
    }
}