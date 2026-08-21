// Last updated: 8/21/2026, 2:03:18 PM
1class Solution {
2    
3    public int[][] insert(int[][] intervals, int[] newInterval) {
4        
5         List<int[]> result = new ArrayList<>();
6        
7         for(int[] i : intervals){
8             if(newInterval == null || i[1] < newInterval[0]){
9                 result.add(i);
10             }else if(i[0] > newInterval[1]){
11                // be carefult the sequence here
12                 result.add(newInterval);
13                 result.add(i);
14                 newInterval = null;
15             }else{
16                 
17                 newInterval[0] = Math.min(newInterval[0], i[0]);//get min
18                 newInterval[1] = Math.max(newInterval[1], i[1]);//get max
19             }
20         }
21        
22        if(newInterval != null)
23            result.add(newInterval);
24        
25        return result.toArray(new int[result.size()][]);
26    }
27}