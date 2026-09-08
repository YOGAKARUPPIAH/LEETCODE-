class Solution {
    public int[][] generateMatrix(int n) {
        int[][]arr=new int[n][n];
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
int num=1;

        while(top<=bottom&& left<=right){

            for(int i=left;i<=right;i++){
                  arr[top][i]=num;
                  num++;  
            }
            top++;
            for(int j=top;j<=bottom;j++){
                arr[j][right]=num;
                num++;
            }
            right--;
            for(int k=right;k>=left;k--){
                arr[bottom][k]=num;
                num++;
            }
            bottom--;
        for(int m=bottom;m>=top;m--){
            arr[m][left]=num;
            num++;
        }
        left++;
        }
        return arr;
    }
}