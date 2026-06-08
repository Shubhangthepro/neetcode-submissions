class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];

                if (ch == '.')
                    continue;

                if (!set.add("row" + r + ch)
                    || !set.add("col" + c + ch) 
                    || !set.add("box" + (r / 3) + (c / 3) + ch)) {
                    return false;
                }
            }
        }
        return true;
    }
}
