class Solution{
    public void gameOfLife(int[][] board){
        int[][] og=new int[board.length][board[0].length];
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[0].length;col++){
                og[row][col]=board[row][col];
            }
        }
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[0].length;col++){
                int count=0;
                for(int i=row-1;i<=row+1;i++){
                    for(int j=col-1;j<=col+1;j++){
                        if(i>=0&&i<board.length&&j>=0&&j<board[0].length){
                            if(row==i&&col==j){
                                continue;
                            }
                            if(og[i][j]==1){
                                count++;
                            }
                        }
                    }
                }
                if(og[row][col]==1){
                    if(count<2||count>3){
                        board[row][col]=0;
                    }else{
                        board[row][col]=1;
                    }
                }else{
                    if(count==3){
                        board[row][col]=1;
                    }else{
                        board[row][col]=0;
                    }
                }
            }
        }
    }
}