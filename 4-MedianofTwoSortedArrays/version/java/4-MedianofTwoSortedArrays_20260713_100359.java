// Last updated: 7/13/2026, 10:03:59 AM
1class Solution {
2    public boolean isPalindrome(int x) {
3        String s = String.valueOf(x); // Convert to String
4        int n = s.length(); // Store the String length to int n
5
6        for (int i=0; i<n/2; i++) {
7            // We check whether the elements at the same distance from
8            // beginning and from ending are same, if not we return false
9            if (s.charAt(i) != s.charAt(n-i-1)) return false;
10        }
11
12        // if no flaws are found we return true
13        return true;
14    }
15}