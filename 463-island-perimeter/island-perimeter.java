class Solution {
    public int islandPerimeter(int[][] grid) {
        
            int count=0;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]==1){
                        int sum=4;
                    if(i>0&&grid[i-1][j]==1)
                        sum--;
                    if(i<grid.length-1&&grid[i+1][j]==1)
                        sum--;
                    if(j>0&&grid[i][j-1]==1)
                        sum--;
                    if(j<grid[0].length-1&&grid[i][j+1]==1)
                        sum--;
                    count+=sum;
                    }
                }
                
            }
            return count;
    }
}