class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
    int[][] newArr = new int[image.length][image[0].length];

        int rows = image.length;
        int cols = image[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = cols - 1; j >= 0; j--) {
                newArr[i][cols - 1 - j] = 1 - image[i][j];
            }
        }

        return newArr;
    }
}