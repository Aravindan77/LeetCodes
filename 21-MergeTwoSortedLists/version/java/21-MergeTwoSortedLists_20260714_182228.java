// Last updated: 7/14/2026, 6:22:28 PM
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> res = new ArrayList<String>();
4        recurse(res, 0, 0, "", n);
5        return res;
6    }
7    
8    public void recurse(List<String> res, int left, int right, String s, int n) {
9        if (s.length() == n * 2) {
10            res.add(s);
11            return;
12        }
13        
14        if (left < n) {
15            recurse(res, left + 1, right, s + "(", n);
16        }
17        
18        if (right < left) {
19            recurse(res, left, right + 1, s + ")", n);
20        }
21    }
22	// See above tree diagram with parameters (left, right, s) for better understanding
23}