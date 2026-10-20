
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = 0;
        int n = nums.length;

        for (int i = 0; i < k; i++) {
            ans += nums[i];
        }

        double max = ans / k;

        for (int i = k; i < n; i++) {
            ans += nums[i];
            ans -= nums[i - k];

            max = Math.max(max, ans / k);
        }

        return max;
    }
}
