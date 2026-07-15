// Last updated: 7/15/2026, 12:14:06 PM
1class Solution {
2    public int longestValidParentheses(String s) {
3    int leftCount = 0;
4    int rightCount = 0;
5    int maxLength = 0;
6    
7    for (int i = 0; i < s.length(); i++) {
8        if (s.charAt(i) == '(') {
9            leftCount++;
10        } else {
11            rightCount++;
12        }
13        
14        if (leftCount == rightCount) {
15            maxLength = Math.max(maxLength, 2 * rightCount);
16        } else if (rightCount > leftCount) {
17            leftCount = rightCount = 0;
18        }
19    }
20    
21    leftCount = rightCount = 0;
22    
23    for (int i = s.length() - 1; i >= 0; i--) {
24        if (s.charAt(i) == '(') {
25            leftCount++;
26        } else {
27            rightCount++;
28        }
29        
30        if (leftCount == rightCount) {
31            maxLength = Math.max(maxLength, 2 * leftCount);
32        } else if (leftCount > rightCount) {
33            leftCount = rightCount = 0;
34        }
35    }
36    
37    return maxLength;
38    }
39}