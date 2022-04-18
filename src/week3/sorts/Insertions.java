package src.week3.sorts;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;

public class Insertions {
    private static ArrayList<Integer> input = new ArrayList<Integer>();

    public static ArrayList<Integer> getInput() {
        return input;
    }

    //Just for the display purpose
    public Insertions(ArrayList<Integer> input){
        Insertions.input = input;
    }

    public static void sortGivenArray(){
        int key = 0; //value to compare
        int j = 0; //index of other value

        //loop through list
        for(int i = 0; i < input.size(); i++){
            key = input.get(i); //get value at index
            j = i - 1; //get index to previous value
            //compare value at the jth index to key
            while(j >= 0 && input.get(j) > key){
                input.set(j+1, input.get(j));
                j--; //move to previous index
            }
            input.set(j+1, key); //set with new value
        }
    }


    public static void sort(ArrayList<Integer> a){
        Insertions is = new Insertions(a);
    }
}