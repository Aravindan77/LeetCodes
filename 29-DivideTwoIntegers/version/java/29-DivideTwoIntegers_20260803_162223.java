// Last updated: 8/3/2026, 4:22:23 PM
1class Solution {
2    public int divide(int dividend, int divisor) {
3        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
4        long dvd = Math.abs((long)dividend);
5        long dvs = Math.abs((long)divisor);
6        long quotient = 0;
7
8        while(dvd >= dvs) {
9            long temp = dvs , multiple = 1;
10            while(dvd >= (temp << 1)) {
11                temp <<= 1;
12                multiple <<= 1;
13            }
14            dvd -= temp;
15            quotient += multiple;
16        }        
17        if ((dividend < 0) ^ (divisor < 0)) return (int)-quotient;
18        return (int)quotient;
19    }
20}