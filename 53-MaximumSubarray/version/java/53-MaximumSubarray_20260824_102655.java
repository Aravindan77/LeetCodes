// Last updated: 8/24/2026, 10:26:55 AM
1class Solution {
2    public int[][] generateMatrix(int n) {
3        int x = 0, y = 0, dx = 1, dy = 0;
4        int[][] res = new int[n][n];
5
6        for (int i = 0; i < n * n; i++) {
7            res[y][x] = i + 1;
8
9            if (!(0 <= x + dx && x + dx < n && 0 <= y + dy && y + dy < n && res[y+dy][x+dx] == 0)) {
10                int temp = dx;
11                dx = -dy;
12                dy = temp;
13            }
14            
15            x += dx;
16            y += dy;
17        }
18
19        return res;        
20    }
21}