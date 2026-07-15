// Last updated: 7/15/2026, 12:13:07 PM
1class Solution {
2    void reverse(int[] nums, int start, int end) {
3        while (start < end) {
4            int temp = nums[start];
5            nums[start] = nums[end];
6            nums[end] = temp;
7            start++;
8            end--;
9        }
10    }
11
12    public void nextPermutation(int[] nums) {
13        int idx = -1;
14        int n = nums.length;
15
16        for (int i = n - 2; i >= 0; i--) {
17            if (nums[i] < nums[i + 1]) {
18                idx = i;
19                break;
20            }
21        }
22
23        if (idx == -1) {
24            reverse(nums, 0, n - 1);
25            return;
26        }
27
28        reverse(nums, idx + 1, n - 1);
29
30        int newj = -1;
31        for (int j = idx + 1; j < n; j++) {
32            if (nums[idx] < nums[j]) {
33                newj = j;
34                break;
35            }
36        }
37
38        int temp = nums[idx];
39        nums[idx] = nums[newj];
40        nums[newj] = temp;
41    }
42}