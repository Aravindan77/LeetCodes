// Last updated: 7/28/2026, 2:58:57 PM
1class Solution {
2    public String countAndSay(int n) {
3        String res = "1";
4        for (int i = 1; i < n; i++) {
5            StringBuilder temp = new StringBuilder();
6            int count = 1;
7            for (int j = 1; j < res.length(); j++) {
8                if (res.charAt(j) == res.charAt(j - 1)) {
9                    count++;
10                } else {
11                    temp.append(count).append(res.charAt(j - 1));
12                    count = 1;
13                }
14            }
15            temp.append(count).append(res.charAt(res.length() - 1));
16            res = temp.toString();
17        }
18        return res;
19    }
20}