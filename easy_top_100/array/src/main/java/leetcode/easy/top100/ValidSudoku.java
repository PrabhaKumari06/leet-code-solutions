package leetcode.easy.top100;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> row = new HashMap<>();
        Map<Integer, Set<Character>> col = new HashMap<>();
        Map<String, Set<Character>> square = new HashMap<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue;

                String squareKey = (r / 3) + "," + (c / 3);

                if (row.computeIfAbsent(r, k -> new HashSet<>()).contains(board[r][c]) ||
                        col.computeIfAbsent(c, k -> new HashSet<>()).contains(board[r][c]) ||
                        square.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(squareKey)) {
                    return false;
                }
                row.get(r).add(board[r][c]);
                col.get(c).add(board[r][c]);
                square.get(squareKey).add(board[r][c]);

            }
        }
        return true;
    }
}
