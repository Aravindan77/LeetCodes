// Last updated: 7/9/2026, 9:09:20 AM
class Solution {
    public String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");

        StringBuilder ans = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            ans.append(words[i]);

            if (i != 0)
                ans.append(" ");
        }

        return ans.toString();
    }
}