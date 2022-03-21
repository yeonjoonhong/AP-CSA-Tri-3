# AP-CSA-Tri-3 Yeonjoon Hong | Anti-Squirrel Task Force
Individual Github Repo for AP-CSA Tri 3

Week 0 Review Ticket:
https://github.com/yeonjoonhong/yeonjoonhong.github.io/issues/1

Plans for Tech Talks:

Tech Talk 1:

    Overarching concept/notes:
    Questions:

Tech Talk 2:

    Overarching concept/notes:
    Questions:

Tech Talk 3:

    Overarching concept/notes:
    Questions:

Tech Talk 4:

    Overarching concept/notes:
    Questions:

Tech Talk 5:

    Overarching concept/notes: Data Structures:
    A data structure is a method of organizing data. Think of a variable holding a single integer value(ex: int n=4;) or sequences of numbers(ex: int[] numbers=new int[]{ 1,2,3 };) or tables of data, or databases: these are all well-defined data structures. Data Structures and organizing data will require students to become more algorithmic in coding.
    There are many algorithms for different purposes and they interact with different data structures. Think of algorithms as dynamic underlying pieces that interact with data structures. Together, data structures and algorithms combine and allow programmers to build whatever computer programs they’d like. Well managed data structures and algorithms ensures well-optimized and efficient code.
    Questions: No questions this week

Tech Talk 6:

    Overarching concept/notes:
    Questions:

Tech Talk 7:

    Overarching concept/notes:
    Questions:

Tech Talk 8:

    Overarching concept/notes:
    Questions:

Tech Talk 9:

    Overarching concept/notes:
    Questions:

Tech Talk 10:

    Overarching concept/notes:
    Questions:

Problem Solutions: Week 1:

import java.util.Arrays;
import java.util.function.Consumer;

public class Main {
  public static void main(String[] args) {
    final int[][] matrix = new int[3][3];

    Consumer<int[]> noDelimiter = (row) -> {
      Arrays.stream(row).forEach((el) -> System.out.print(" " + el + " "));
      System.out.println();
    };

    Consumer<int[]> pipeDelimiter = (row) -> {
      Arrays.stream(row).forEach((el) -> System.out.print("| " + el + " "));
      System.out.println("|");
    };

    Consumer<int[]> likeAList = (row) -> {
      System.out.print("[");
      Arrays.stream(row).forEach((el) -> System.out.print(" " + el + " "));
      System.out.println("]");
    };

    printMatrix(matrix, noDelimiter);
    System.out.println();
    printMatrix(matrix, pipeDelimiter);
    System.out.println();
    printMatrix(matrix, likeAList);
  }

  public static void printMatrix(int[][] matrix, Consumer<int[]> rowPrinter) {
    Arrays.stream(matrix).forEach((row) -> rowPrinter.accept(row));
  }
}

Week 2:

Week 3:

Week 4:

Week 5:

Week 6:

Week 7:

Week 8:

Week 9:

Week 10:

Ap Test prep plan:

    Review One unit per week, this will give ample time to review all content.
    Week of March 7th: Review Unit 1+2 content. Do practice MC and FRQ, and place the link to the completed work here
    Week of March 14th: Review Unit 3+4 content. Do practice MC and FRQ, and place the link to the completed work here
    Week of March 21th: Review Unit 5 content. Do practice MC and FRQ, and place the link to the completed work here
    Week of March 28th: Review Unit 6 content. Do practice MC and FRQ, and place the link to the completed work here
    Week of April 4th: Review Unit 7 content. Do practice MC and FRQ, and place the link to the completed work here
    Week of April 11th: Review Unit 8 content. Do practice MC and FRQ, and place the link to the completed work here
    Week of April 18th: Review Unit 9 content. Do practice MC and FRQ, and place the link to the completed work here
    Week of April 25th: Review Unit 10 content. Do practice MC and FRQ, and place the link to the completed work here
    Week of April 26th-May 3rd: Do Practice test throughout the week with corrections (2-3) here
