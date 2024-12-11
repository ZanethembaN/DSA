package portfolio;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    /**
     * Validates if the given Sudoku board is valid.
     *
     * @param board the 9x9 Sudoku board
     * @return true if the board is valid, false otherwise
     */
    public boolean isValidSudoku(char[][] board) {

        // Validate input dimensions
        if (board == null || board.length != 9 || board[0].length != 9) throw new IllegalArgumentException("Board must be a 9x9 grid!");

        Set<String> seen = new HashSet<>();

        // Iterate over each cell in the board
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){

                int current = board[i][j];

                // Skip empty cells
                if (current != '.'){

                    // Generate unique keys for row, column, and sub-box
                    String row = "row" + i + ":" + current;
                    String col = "col" + j + ":" + current;
                    String box = "box" + (i / 3) + (j / 3) + current;

                    if (seen.contains(row) || seen.contains(col) || seen.contains(box)) return false;

                    seen.add(row);
                    seen.add(col);
                    seen.add(box);

                }
            }
        }
        return true;
    }
}
