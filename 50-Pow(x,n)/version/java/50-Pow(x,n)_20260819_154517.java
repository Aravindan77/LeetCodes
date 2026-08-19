// Last updated: 8/19/2026, 3:45:17 PM
1class Solution {
2    public double myPow(double x, int n) {
3        return binaryExp(x, (long) n);
4    }
5
6    private double binaryExp(double x, long n) {
7        if (n == 0) {
8            return 1;
9        }
10       
11        if (n < 0) {
12            return 1.0 / binaryExp(x, -n);
13        }
14       
15        if (n % 2 == 1) {
16            return x * binaryExp(x * x, (n - 1) / 2);
17        } else {
18            return binaryExp(x * x, n / 2);
19        }
20    }
21}