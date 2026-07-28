// Last updated: 7/28/2026, 2:19:38 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        if (nums.length == 0) 
4            return 0;
5        Set<Integer> h = new HashSet<>();
6        for (int num : nums) 
7            h.add(num);
8        int lStreak = 0;
9        for (int num : h)
10            if (!h.contains(num - 1)) {
11                int numm = num;
12                int cStreak = 1;
13                while (h.contains(numm + 1)) {
14                    numm++;
15                    cStreak++;
16                }
17                lStreak = Math.max(lStreak, cStreak);
18            }
19        return lStreak;
20    }
21}