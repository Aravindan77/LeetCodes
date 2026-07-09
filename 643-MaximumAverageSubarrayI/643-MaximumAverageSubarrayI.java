// Last updated: 7/9/2026, 9:09:07 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
      int sum=0;
      int max=0;

      for(int i=0;i<k;i++) {
        sum=sum+nums[i];
      }

      max=sum;

      for(int i=k;i<nums.length;i++) {
        sum+=nums[i]-nums[i-k];
        max=Math.max(max,sum);
      }

      return (double)max/k;

    }
}