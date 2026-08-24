// Last updated: 8/24/2026, 10:25:58 AM
1class Solution {
2    public String getPermutation(int n, int k) {
3        int[] fact = new int[n + 1];
4        fact[0] = 1;
5
6        for (int i = 1; i <= n; i++) {
7            fact[i] = fact[i - 1] * i;
8        }
9
10        boolean[] used = new boolean[n + 1];
11        StringBuilder res = new StringBuilder();
12
13        k--;
14
15        for (int pos = n; pos >= 1; pos--) {
16            int block = fact[pos - 1];
17            int idx = k / block;
18            k %= block;
19
20            for (int num = 1; num <= n; num++) {
21                if (used[num])
22                    continue;
23
24                if (idx == 0) {
25                    res.append(num);
26                    used[num] = true;
27                    break;
28                }
29
30                idx--;
31            }
32        }
33
34        return res.toString();
35    }
36}