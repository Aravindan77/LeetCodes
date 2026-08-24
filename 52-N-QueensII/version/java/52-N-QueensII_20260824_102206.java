// Last updated: 8/24/2026, 10:22:06 AM
1class Solution {
2
3    private int solve(int n, int col, char[][] board,
4                      int[] visitedRow, int[] lowerDiagonal,
5                      int[] upperDiagonal, int ans) {
6
7        if (col == n) {
8            return ans + 1;
9        }
10
11        for (int row = 0; row < n; row++) {
12
13            if (visitedRow[row] == 0
14                    && lowerDiagonal[row + col] == 0
15                    && upperDiagonal[n - row + col - 1] == 0) {
16
17                board[row][col] = 'Q';
18
19                visitedRow[row] = 1;
20                lowerDiagonal[row + col] = 1;
21                upperDiagonal[n - row + col - 1] = 1;
22
23                ans = solve(n, col + 1, board,
24                            visitedRow, lowerDiagonal,
25                            upperDiagonal, ans);
26
27                board[row][col] = '.';
28
29                visitedRow[row] = 0;
30                lowerDiagonal[row + col] = 0;
31                upperDiagonal[n - row + col - 1] = 0;
32            }
33        }
34
35        return ans;
36    }
37
38    public int totalNQueens(int n) {
39
40        int ans = 0;
41
42        char[][] board = new char[n][n];
43
44        for (int i = 0; i < n; i++) {
45            Arrays.fill(board[i], '.');
46        }
47
48        int[] visitedRow = new int[n];
49        int[] lowerDiagonal = new int[2 * n - 1];
50        int[] upperDiagonal = new int[2 * n - 1];
51
52        ans = solve(n, 0, board, visitedRow,
53                    lowerDiagonal, upperDiagonal, ans);
54
55        return ans;
56    }
57}