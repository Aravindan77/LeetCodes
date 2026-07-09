// Last updated: 7/9/2026, 9:09:06 AM
class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> have = new HashMap<>();

        for(int i=0;i<ransomNote.length();i++) {

            char ch = ransomNote.charAt(i);

            need.put(
                ch,
                need.getOrDefault(ch,0)+1
            );
        }

        for(int i=0;i<magazine.length();i++) {

            char ch = magazine.charAt(i);

            have.put(
                ch,
                have.getOrDefault(ch,0)+1
            );
        }

        for(Character ch : need.keySet()) {

            if(have.getOrDefault(ch,0)
                < need.get(ch)) {

                return false;
            }
        }

        return true;
    }
}