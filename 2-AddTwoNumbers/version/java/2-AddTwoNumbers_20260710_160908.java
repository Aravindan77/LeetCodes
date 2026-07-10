// Last updated: 7/10/2026, 4:09:08 PM
1class Solution {
2
3    public String longestPalindrome(String s) {
4
5        String ans = "";
6
7        for (int i = 0; i < s.length(); i++) {
8
9            for (int j = i; j < s.length(); j++) {
10
11                String sub = s.substring(i, j + 1);
12
13                if (isPalindrome(sub) && sub.length() > ans.length()) {
14                    ans = sub;
15                }
16            }
17        }
18
19        return ans;
20    }
21
22    public boolean isPalindrome(String str) {
23
24        int left = 0;
25        int right = str.length() - 1;
26
27        while (left < right) {
28
29            if (str.charAt(left) != str.charAt(right))
30                return false;
31
32            left++;
33            right--;
34        }
35
36        return true;
37    }
38}