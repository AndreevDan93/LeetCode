class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Character> row = new HashSet<>();
            Set<Character> col = new HashSet<>();
            for (int j = 0; j < board[1].length; j++) {
                if (board[i][j] != '.') {
                    if (!row.add(board[i][j])) {
                        return false;
                    }
                }

                if (board[j][i] != '.') {
                    if (!col.add(board[j][i])) {
                        return false;
                    }
                }

                if (j % 3 == 0 && i % 3 == 0) {
                    if (!checkBlock(i, j, board)) {
                        return false;
                    }
                }
            }
        }
        return true; 
    }

     private static boolean checkBlock(int iInd, int jInd, char[][] board) {
       Set<Character> block = new HashSet<>();
        for (int i = iInd; i < iInd + 3; i++) {
            for (int j = jInd; j < jInd + 3; j++) {
                if (board[j][i] != '.') {
                    if (!block.add(board[j][i])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}