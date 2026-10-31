class Solution {

    static double solve(double x, long n) {

        double ans = 1.0;

        while (n > 0) {

            if (n % 2 == 1) {
                ans = ans * x;
            }

            x = x * x;
            n = n / 2;
        }

        return ans;
    }

    public double myPow(double x, int n) {

        long num = Math.abs((long)n);

        double ans = solve(x, num);

        if (n < 0) {
            return 1.0 / ans;
        }

        return ans;
    }
}