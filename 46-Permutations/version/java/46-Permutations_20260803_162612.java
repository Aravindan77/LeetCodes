// Last updated: 8/3/2026, 4:26:12 PM
1class Solution {
2    public void backtrack(int i, int[] nums, List<List<Integer>> res) {
3        if (i == nums.length) {
4            List<Integer> temp = new ArrayList<>();
5            for (int x : nums) temp.add(x);
6            res.add(temp);
7            return;
8        }
9
10        Set<Integer> seen = new HashSet<>();
11
12        for (int j = i; j < nums.length; j++) {
13            if (seen.contains(nums[j])) continue;
14
15            seen.add(nums[j]);
16
17            int tmp = nums[i];
18            nums[i] = nums[j];
19            nums[j] = tmp;
20
21            backtrack(i + 1, nums, res);
22
23            tmp = nums[i];
24            nums[i] = nums[j];
25            nums[j] = tmp; // backtrack
26        }
27    }
28
29    public List<List<Integer>> permuteUnique(int[] nums) {
30        List<List<Integer>> res = new ArrayList<>();
31        backtrack(0, nums, res);
32        return res;
33    }
34}