// Last updated: 7/28/2026, 3:01:55 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> res = new ArrayList<>();
4
5        makeCombination(candidates, target, 0, new ArrayList<>(), 0, res);
6        return res;        
7    }
8
9    private void makeCombination(int[] candidates, int target, int idx, List<Integer> comb, int total, List<List<Integer>> res) {
10        if (total == target) {
11            res.add(new ArrayList<>(comb));
12            return;
13        }
14
15        if (total > target || idx >= candidates.length) {
16            return;
17        }
18
19        comb.add(candidates[idx]);
20        makeCombination(candidates, target, idx, comb, total + candidates[idx], res);
21        comb.remove(comb.size() - 1);
22        makeCombination(candidates, target, idx + 1, comb, total, res);
23    }    
24}