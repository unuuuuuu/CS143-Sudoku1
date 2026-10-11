import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokuBoard {
    
    private char[][] board;
    
    public SudokuBoard(String fileName) 
            throws FileNotFoundException {
        board = new char[9][9];
        
        Scanner input = new Scanner(new File(fileName));
        
        for (int i = 0; i < 9; i++) {
            String line = input.nextLine();
            
            while (line.trim().isEmpty()) {
                line = input.nextLine();
            }
            
            for (int j = 0; j < 9; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        
        input.close();
    }

    public String toString() {
        String result = "";
    
        for (int i = 0; i < 9; i++) {
            if (i > 0 && i % 3 == 0) {
                result += "------+-------+------\n";
            }
        
            for (int j = 0; j < 9; j++) {
                if (j > 0 && j % 3 == 0) {
                    result += " | ";
                } else if (j > 0) {
                    result += " ";
                }
                result += board[i][j];
            }
            result += "\n";
        }
        return result;
    }
}



