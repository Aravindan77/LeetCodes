// Last updated: 7/9/2026, 9:09:56 AM
class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int width=0;
        int curare=0;
        int maxarea=0;

        while(i<j) {
            width=j-i;
            curare=width*Math.min(height[i],height[j]);
            maxarea=Math.max(maxarea,curare);
            if(height[i]<height[j]) {
                i++;
            }
            else {
                j--;
            }
        }
        return maxarea;
    }
}