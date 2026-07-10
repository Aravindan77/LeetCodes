// Last updated: 7/10/2026, 4:22:41 PM
1class Solution {
2    public int reverse(int x) {
3
4        int rev = 0;
5
6        while (x != 0) {
7
8            int digit = x % 10;
9
10            if (rev > Integer.MAX_VALUE / 10 ||
11                (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
12                return 0;
13            }
14
15            if (rev < Integer.MIN_VALUE / 10 ||
16                (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
17                return 0;
18            }
19
20            rev = rev * 10 + digit;
21            x /= 10;
22        }
23
24        return rev;
25    }
26}