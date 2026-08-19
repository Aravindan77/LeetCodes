// Last updated: 8/19/2026, 2:52:15 PM
1class Solution {
2    public int maximumProduct(int[] nums) {
3
4        Arrays.sort(nums);
5
6        int n = nums.length;
7
8        int p1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
9        int p2 = nums[0] * nums[1] * nums[n - 1];
10
11        return Math.max(p1, p2);
12    }
13}
14
15