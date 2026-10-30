class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0;
        int c = 0;
        int max = 0;

        while (i < n) {

            if (nums[i] == 0) {
                c++;
            }

            while (c > 1) {
                if (nums[j] == 0) {
                    c--;
                }
                j++;
            }

            max = Math.max(max, i - j);
            i++;
        }

        return max;
    }
}