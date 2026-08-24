// Last updated: 8/24/2026, 10:27:28 AM
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        if (obstacleGrid == null || obstacleGrid[0][0] == 1) {
4            return 0;
5        }
6
7        int rows = obstacleGrid.length;
8        int cols = obstacleGrid[0].length;
9        int[] dp = new int[cols];
10        dp[0] = 1;
11
12        for (int r = 0; r < rows; r++) {
13            for (int c = 0; c < cols; c++) {
14                if (obstacleGrid[r][c] == 1) {
15                    dp[c] = 0;
16                } else {
17                    if (c > 0) {
18                        dp[c] += dp[c - 1];
19                    }
20                }
21            }
22        }
23
24        return dp[cols - 1];        
25    }
26}