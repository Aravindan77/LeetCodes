// Last updated: 7/28/2026, 3:07:13 PM
1class Solution {
2    // Function to swap elements in the array
3    private void swap(int[] arr, int i, int j) {
4        int temp = arr[i];
5        arr[i] = arr[j];
6        arr[j] = temp;
7    }
8    
9    public int firstMissingPositive(int[] nums) {
10        int n = nums.length;
11        
12        // Place each positive integer i at index i-1 if possible
13        for (int i = 0; i < n; i++) {
14            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
15                swap(nums, i, nums[i] - 1);
16            }
17        }
18        
19        // Find the first missing positive integer
20        for (int i = 0; i < n; i++) {
21            if (nums[i] != i + 1) {
22                return i + 1;
23            }
24        }
25        
26        // If all positive integers from 1 to n are present, return n + 1
27        return n + 1;
28    }
29}
30
31