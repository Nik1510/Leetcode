class Solution {
    public int countNegatives(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int countNegative=0;
        int row=m-1;int col=0;
        while(row>=0 && col<=n-1)
        {
            if(grid[row][col]<0){  //then this means that all of following instances are also negative
                countNegative+=n-col;  //from current index to last one in row...(n-1)-col..+1
                row--;
            }
            else{
                col++;
            }


        }
    return countNegative;
    }
}