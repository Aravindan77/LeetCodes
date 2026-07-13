// Last updated: 7/13/2026, 10:12:50 AM
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        List<List<Integer>> res = new ArrayList<>();
4        int n = nums.length;
5        if (n < 4) return res;
6        Arrays.sort(nums);
7
8        for (int i = 0; i < n - 3; i++) {
9            // Skip duplicates for i
10            if (i > 0 && nums[i] == nums[i - 1]) continue;
11            
12            // Pruning
13            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break;
14            if ((long) nums[i] + nums[n - 3] + nums[n - 2] + nums[n - 1] < target) continue;
15
16            for (int j = i + 1; j < n - 2; j++) {
17                // Skip duplicates for j
18                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
19                
20                // Pruning inside j loop
21                if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break;
22                if ((long) nums[i] + nums[j] + nums[n - 2] + nums[n - 1] < target) continue;
23
24                int k = j + 1;
25                int l = n - 1;
26                while (k < l) {
27                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
28                    if (sum == target) {
29                        res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
30                        while (k < l && nums[k] == nums[k + 1]) k++; // Skip k duplicates
31                        while (k < l && nums[l] == nums[l - 1]) l--; // Skip l duplicates
32                        k++;
33                        l--;
34                    } else if (sum < target) {
35                        k++;
36                    } else {
37                        l--;
38                    }
39                }
40            }
41        }
42        return res;
43    }
44}