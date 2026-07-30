class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentChar = board[i][j];

                // skip empty cell
                if (currentChar == '.') {
                    continue;
                }

                boolean inRow = seen.add(currentChar + " at row " + i);

                boolean inColumn = seen.add(currentChar + " at column " + j);

                boolean inBox = seen.add(currentChar + " in box " + i/3 + "-" + j/3);

                if (!inRow || !inColumn || !inBox) {
                    return false;
                }
            }
        }

        return true;
    }
}
