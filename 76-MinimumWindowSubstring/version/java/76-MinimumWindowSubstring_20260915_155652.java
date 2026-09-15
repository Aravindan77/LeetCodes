// Last updated: 9/15/2026, 3:56:52 PM
1class Solution {
2    public String minWindow(String s, String t) {
3        if (s.isEmpty() || t.isEmpty()) {
4            return "";
5        }
6
7        Map<Character, Integer> dictT = new HashMap<>();
8        for (char c : t.toCharArray()) {
9            int count = dictT.getOrDefault(c, 0);
10            dictT.put(c, count + 1);
11        }
12
13        int required = dictT.size();
14        int l = 0, r = 0;
15        int formed = 0;
16
17        Map<Character, Integer> windowCounts = new HashMap<>();
18        int[] ans = { -1, 0, 0 };
19
20        while (r < s.length()) {
21            char c = s.charAt(r);
22            int count = windowCounts.getOrDefault(c, 0);
23            windowCounts.put(c, count + 1);
24
25            if (dictT.containsKey(c) && windowCounts.get(c).intValue() == dictT.get(c).intValue()) {
26                formed++;
27            }
28
29            while (l <= r && formed == required) {
30                c = s.charAt(l);
31
32                if (ans[0] == -1 || r - l + 1 < ans[0]) {
33                    ans[0] = r - l + 1;
34                    ans[1] = l;
35                    ans[2] = r;
36                }
37
38                windowCounts.put(c, windowCounts.get(c) - 1);
39                if (dictT.containsKey(c) && windowCounts.get(c).intValue() < dictT.get(c).intValue()) {
40                    formed--;
41                }
42
43                l++;
44            }
45
46            r++;
47        }
48
49        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
50    }
51}
52