// Last updated: 7/9/2026, 9:09:09 AM
import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int h = n - i;

            if (citations[i] >= h) {
                return h;
            }
        }

        return 0;
    }
}