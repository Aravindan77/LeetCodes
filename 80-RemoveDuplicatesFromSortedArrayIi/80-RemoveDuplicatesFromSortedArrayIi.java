// Last updated: 7/9/2026, 9:09:31 AM
class Solution {
    public int removeDuplicates(int[] nums) {

        // If array size <= 2
        if (nums.length <= 2) {
            return nums.length;
        }

        int k = 2;

        for (int i = 2; i < nums.length; i++) {

            // Compare with element two positions before
            if (nums[i] != nums[k - 2]) {

                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}