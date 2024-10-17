class Solution {
    public int candy(int[] r) {
         int[] c = new int[r.length];
            for (int i = 0; i < r.length; i++) {
                c[i] = 1;
            }

            for (int i = 1; i < r.length; i++) {
                if (r[i] > r[i - 1]) {
                    c[i] = c[i - 1] + 1;
                }
            }

            for (int i = r.length - 2; i >= 0; i--) {
                if (r[i] > r[i + 1]) {
                    c[i] = Math.max(c[i], c[i + 1] + 1);
                }
            }

            int sum = 0;
            for (int i = 0; i < c.length; i++) {
                sum += c[i];
            }

        return sum;
    }
}