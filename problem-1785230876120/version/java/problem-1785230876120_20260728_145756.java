// Last updated: 7/28/2026, 2:57:56 PM
1class Solution {
2
3    public void solveSudoku(char[][] board) {
4
5        solve(board);
6    }
7
8    private boolean solve(char[][] board) {
9
10        for (int row = 0; row < 9; row++) {
11
12            for (int col = 0; col < 9; col++) {
13
14                if (board[row][col] == '.') {
15
16                    for (char ch = '1'; ch <= '9'; ch++) {
17
18                        if (isValid(board, row, col, ch)) {
19
20                            board[row][col] = ch;
21
22                            if (solve(board))
23                                return true;
24
25                            board[row][col] = '.';
26                        }
27                    }
28
29                    return false;
30                }
31            }
32        }
33
34        return true;
35    }
36
37    private boolean isValid(char[][] board,
38                            int row,
39                            int col,
40                            char ch) {
41
42        // Check row
43        for (int i = 0; i < 9; i++) {
44
45            if (board[row][i] == ch)
46                return false;
47        }
48
49        // Check column
50        for (int i = 0; i < 9; i++) {
51
52            if (board[i][col] == ch)
53                return false;
54        }
55
56        // Check 3 × 3 box
57        int startRow = (row / 3) * 3;
58        int startCol = (col / 3) * 3;
59
60        for (int i = startRow; i < startRow + 3; i++) {
61
62            for (int j = startCol; j < startCol + 3; j++) {
63
64                if (board[i][j] == ch)
65                    return false;
66            }
67        }
68
69        return true;
70    }
71}