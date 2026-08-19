// Last updated: 8/19/2026, 2:51:23 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max1 = 0;
4        int max2 = 0;
5        for (int num : nums) {
6            if (num > max1) {
7                max2 = max1;
8                max1 = num;
9            }
10            else if (num > max2)
11                max2 = num;
12        }
13        return (max1 - 1) * (max2 - 1);
14    }
15}