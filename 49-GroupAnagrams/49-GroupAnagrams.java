// Last updated: 7/9/2026, 9:09:39 AM
class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map =
                new HashMap<>();

        for(String str : strs) {

            char arr[] = str.toCharArray();

            Arrays.sort(arr);

            String key = new String(arr);

            if(!map.containsKey(key)) {

                map.put(
                    key,
                    new ArrayList<>()
                );
            }

            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}