package portfolio;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){

                int current = board[i][j];

                if (current != '.'){

                    String row = "row" + i + ":" + current;
                    String col = "col" + j + ":" + current;
                    String chkbox = "chkbox" + (i / 3) + (j / 3) + current;

                    if (seen.contains(row) || seen.contains(col) || seen.contains(chkbox)) return false;

                    seen.add(row);
                    seen.add(col);
                    seen.add(chkbox);

                }
            }
        }
        return true;
    }
}
