class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        // Get the initial differences
        int xDiff = coordinates[1][0] - coordinates[0][0];
        int yDiff = coordinates[1][1] - coordinates[0][1];
        
        for (int i = 2; i < coordinates.length; i++) {
            int currentXDiff = coordinates[i][0] - coordinates[0][0];
            int currentYDiff = coordinates[i][1] - coordinates[0][1];
            
            // Check the cross-product
            if (yDiff * currentXDiff != xDiff * currentYDiff) {
                return false;
            }
        }
        return true;
    }
}
