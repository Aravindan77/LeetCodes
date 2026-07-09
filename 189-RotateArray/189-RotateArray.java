// Last updated: 7/9/2026, 9:09:15 AM
class Solution {
    public void rotate(int[] nums, int k) {
    
        int n = nums.length;
        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}   
 