class Solution {
    public double myPow(double x, int n) {
        return solve(x, (long) n);
    }

    double solve(double x, long n) {
        if (x == 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else if (n < 0) {
            return solve(1 / x, -n);
        } else if (n % 2 == 0) {
            return solve(x * x, n / 2);
        } else {
            return x * solve(x * x, (n - 1) / 2);
        }
    }
}
