class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!isValidRow(board, i, j) || !isValidColumn(board, i, j) || !isValidBox(board, i, j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean isValidRow(char[][] board, int row, int col) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == board[row][col] && i != col) {
                return false;
            }
        }
        return true;
    }
    public boolean isValidColumn(char[][] board, int row, int col) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == board[row][col] && i != row) {
                return false;
            }
        }
        return true;
    }
    public boolean isValidBox(char[][] board, int row, int col) {
        int boxRow = row / 3 * 3;
        int boxCol = col / 3 * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[boxRow + i][boxCol + j] == board[row][col] && (boxRow + i != row || boxCol + j != col)) {
                    return false;
                }
            }
        }
        return true;
    }
}
