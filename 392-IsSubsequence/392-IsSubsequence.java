// Last updated: 7/9/2026, 9:09:04 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
       int left=0;
       int right=0;
       while(left<s.length() && right<t.length()) {
          if(s.charAt(left)==t.charAt(right)) {
            left++;
          }
          right++;
       } 
       return left==s.length();
    }
}