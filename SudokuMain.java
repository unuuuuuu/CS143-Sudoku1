import java.io.FileNotFoundException;

public class SudokuMain {
  public static void main(String args[]) 
      throws FileNotFoundException {
    SudokuBoard puzzle = new SudokuBoard("data1.sdk");
    System.out.println(puzzle);
  }
}

/*
# PROGRAM OUTPUT

Paste the output from JGrasp here.
Altering output will earn you an automatic zero for the assignment.

*/