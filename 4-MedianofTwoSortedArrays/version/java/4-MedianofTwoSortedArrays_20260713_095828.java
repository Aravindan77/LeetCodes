// Last updated: 7/13/2026, 9:58:28 AM
1class Solution {
2    public int myAtoi(String s) {
3        s = s.trim();
4        long result =0;
5        StringBuilder ans = new StringBuilder();
6        if(s.length()==0){
7            return 0;
8        }
9        int i =0;
10        int sign = 1;
11        if(s.charAt(i)=='+' || s.charAt(i)=='-'){
12            if(s.charAt(i)=='-'){
13                sign = -1;
14            }
15            i++;
16        }
17        while(i<s.length()){
18            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
19            result = result*10 + (s.charAt(i)-'0');
20            
21            if (sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
22            if (sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
23
24            i++;
25
26            }
27            else{
28                return (int)(sign*result);
29            }
30        }
31        return (int)(sign*result);
32       
33    }
34}