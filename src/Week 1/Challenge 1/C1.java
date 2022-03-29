import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Challenge1 {
    static Queue<String> q;

    public Challenge1() {

    }
    public static void main(String[] args)  {
        q = new LinkedList<>(); // intiialize Queue (from member vars)
        q.add("seven");

        ArrayList<String> submenus;
        submenus = new ArrayList<String>();
        submenus.add("Add Items to Queue");
        submenus.add("Delete Items from Queue");
        submenus.add("Merge 2 Queues");
        submenus.add("Use Stack to Reverse Order of a Queue");
        submenus.add("Exit");

        menu(submenus);
    }

    public static void menu(ArrayList<String> submenus) {

        Scanner scan = new Scanner(System.in);


        System.out.println("-------------------------\n");
        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Enqueue Items to Queue");
        System.out.println("2 - Dequeue Items from Queue");
        System.out.println("3 - Print Current Queue");
        System.out.println("4 - Merge 2 Queues");
        System.out.println("5 - Use Stack to Reverse Order of a Queue");
        System.out.println("6 - Exit");



        int option = scan.nextInt();

        if(option == 1) { // Enqueue
            System.out.println("-------------------------\n");
            System.out.println("Enter a String to enqueue to queue (to tail):");
            System.out.println("-------------------------\n");
            Scanner addQueueScan = new Scanner(System.in);
            String toQueue = addQueueScan.nextLine();
            q.add(toQueue);
            System.out.println("New size of queue: " + q.size());
            menu(submenus);

        } else if (option == 2) { // Dequeue
            System.out.println("-------------------------\n");
            System.out.println("Dequeuing head of queue....");
            System.out.println("-------------------------\n");
            String dequeuedItem = q.remove();
            System.out.println("Dequeued item: " + dequeuedItem);
            System.out.println("New size of queue: " + q.size());
            menu(submenus);
        } else if (option == 3) { // Print queue
            System.out.println("-------------------------\n");
            System.out.println("Printing current queue....");
            System.out.println("-------------------------\n");
            if (q!= null) System.out.println("Words count: " + q.size() + ", data: " + q);
            else {
                System.out.println("Words count: 0, data: null");
            }
            menu(submenus);
        } else if (option == 4) { // Merge two sorted & ordered queues
            System.out.println("-------------------------\n");
            System.out.println("This option will merge together two sorted & ordered Queues -> and then it will sort the final queue.");
            System.out.println("-------------------------\n");

            System.out.println("Queue 1: 1 -> 4 -> 5 -> 8 -> nil");
            System.out.println("Queue 2: 2 -> 3 -> 6 -> 7 -> nil");
            System.out.println("Sorting....");
            Queue<Object> q1 = new LinkedList<>(); // intiialize Queue 1
            q1.add(1);
            q1.add(4);
            q1.add(5);
            q1.add(8);
            q1.add("nil");
            Queue<Object> q2 = new LinkedList<>(); // intiialize Queue 2
            q2.add(2);
            q2.add(3);
            q2.add(6);
            q2.add(7);

            // Sorting -> will sort all Integers in ascending form; place Strings at end
            Queue<Object> sortedQueue = new LinkedList<>();


            int leftPeek = 0;
            int rightPeek = 0;
            while(!q1.isEmpty() && !q2.isEmpty()) {
                if((q1.peek() instanceof Integer) && (q2.peek() instanceof Integer)) {
                    leftPeek = (Integer) q1.peek();  // -> cast both to Integers since we know for a fact the Strings are not in peek pos.
                    rightPeek = (Integer) q2.peek();
                } else { // -> will never be executed <> if/else is simply used to avoid Java InputMismatchException.
                }
                if(leftPeek < rightPeek) {
                    sortedQueue.add(q1.poll());
                } else if(leftPeek > rightPeek) {
                    sortedQueue.add(q2.poll());
                }
            }
            while(!q1.isEmpty()) {
                sortedQueue.add(q1.poll());
            }
            while(!q2.isEmpty()) {
                sortedQueue.add(q2.poll());
            }

            System.out.println(sortedQueue);
            menu(submenus);

        } else if (option == 5) { // Using Stack to Reverse Order of a Queue
            Queue<Integer> q = new LinkedList<>(); // intiialize Queue 
            q.add(1);
            q.add(2);
            q.add(3);

            Stack<Integer> reversedStack = new Stack<>();

            int qSize = q.size(); // need to save, since q.size() will not remain constant -> it will be variable

            for (int i = 0; i < qSize; i++ ) { // loop through queue, delete from Queue, add to Stack
                reversedStack.push(q.poll());
            }
            for (int j = 0; j < qSize; j++ ) { // loop through Stack, delete from Stack, add to Queue
                q.add(reversedStack.pop());
            }
            System.out.println(q); // print queue
            menu(submenus);

        } else { // Exit
            System.exit(0);
        }
    }
}