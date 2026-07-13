// Last updated: 7/13/2026, 9:57:54 AM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int n = nums1.length;
4        int m = nums2.length;
5        int i = 0, j = 0, m1 = 0, m2 = 0;
6
7        // Find median.
8        for (int count = 0; count <= (n + m) / 2; count++) {
9            m2 = m1;
10            if (i != n && j != m) {
11                if (nums1[i] > nums2[j]) {
12                    m1 = nums2[j++];
13                } else {
14                    m1 = nums1[i++];
15                }
16            } else if (i < n) {
17                m1 = nums1[i++];
18            } else {
19                m1 = nums2[j++];
20            }
21        }
22
23        // Check if the sum of n and m is odd.
24        if ((n + m) % 2 == 1) {
25            return (double) m1;
26        } else {
27            double ans = (double) m1 + (double) m2;
28            return ans / 2.0;
29        }
30    }
31}