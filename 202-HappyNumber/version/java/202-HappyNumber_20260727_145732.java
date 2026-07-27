// Last updated: 7/27/2026, 2:57:32 PM
1class Solution {
2    public boolean isHappy(int n) {
3        HashSet<Integer> set = new HashSet<>();
4
5        while (n != 1 && !set.contains(n)) {
6            set.add(n);
7
8            int sum = 0;
9
10            while (n > 0) {
11                int rem = n % 10;
12                sum += rem * rem;
13                n /= 10;
14            }
15
16            n = sum;
17        }
18
19        return n == 1;
20    }
21}