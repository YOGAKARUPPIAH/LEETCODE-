class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][]flipAndInvertImage=new int[image.length][image[0].length];
        
        for(int i=0;i<image.length;i++){
         int[] temp = image[i];

            for(int j = 0, k = image[0].length - 1; 
                j < image[0].length; 
                j++, k--) {
                    if(temp[k]==0){
                        flipAndInvertImage[i][j]=1;
                    }else{
                        flipAndInvertImage[i][j]=0;
                    }
                }
            }
        
        return flipAndInvertImage;
    }
}