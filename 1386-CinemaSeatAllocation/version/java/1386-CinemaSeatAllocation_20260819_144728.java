// Last updated: 8/19/2026, 2:47:28 PM
1class Solution {
2    public int missingInteger(int[] nums) {
3        int n = nums.length;
4
5        int sequentialSum = nums[0];
6
7        // Find sequential prefix sum
8        for(int i = 1; i < n; i++){
9            if(nums[i] == nums[i - 1] + 1)
10                sequentialSum += nums[i];
11            else
12                break;
13        }
14
15        // Brute force search
16        while(true){
17            boolean found = false;
18
19            for(int num : nums){
20                if(num == sequentialSum){
21                    found = true;
22                    break;
23                }
24            }
25
26            if(!found)
27                return sequentialSum;
28
29            sequentialSum++;
30        }
31    }
32}