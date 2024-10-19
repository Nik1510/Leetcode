class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i = 0; i < n; i++){
            sum += mat[i][i]; // sum of primary diagonal
            sum += mat[i][n-i-1]; // sum of secondary diagonal
            if(i == n-i-1) { // if the matrix has odd length, subtract the middle element as it gets counted twice
                sum -= mat[i][i];
            }
        }
        return sum;
    }
}
