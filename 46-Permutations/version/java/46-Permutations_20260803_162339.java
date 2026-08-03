// Last updated: 8/3/2026, 4:23:39 PM
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        permuteHelper(nums, 0, res);
5        return res;
6    }
7
8    private void permuteHelper(int[] nums, int i, List<List<Integer>> res) {
9        if (i == nums.length) {
10            List<Integer> permutation = new ArrayList<>();
11            for (int num : nums) permutation.add(num);
12            res.add(permutation);
13            return;
14        }
15
16        for (int j = i; j < nums.length; j++) {
17            swap(nums, i, j);
18            permuteHelper(nums, i + 1, res);
19            swap(nums, i, j); // backtrack
20        }
21    }
22
23    private void swap(int[] nums, int i, int j) {
24        int tmp = nums[i];
25        nums[i] = nums[j];
26        nums[j] = tmp;
27    }
28}