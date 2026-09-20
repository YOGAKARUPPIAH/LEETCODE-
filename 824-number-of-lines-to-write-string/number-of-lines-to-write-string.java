class Solution {
    public int[] numberOfLines(int[] widths, String s) {

       int line=1;
       int  width=0;
int []ans=new int[2];
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);

        int w=widths[ch-'a'];
        if(width+w <=100){
                width+=w;
        }else{
            line++;
            width=w;
        }

       }
       ans[0]=line;
       ans[1]=width;
return ans;
    }
}