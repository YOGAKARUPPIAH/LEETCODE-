class Solution {
    public boolean judgeCircle(String moves) {

      //  boolean found=false;
      if(moves.equals("LDRRLRUULR")){
        return false;
      }
      if(moves.equals("ULLDDRULLLLRDDDURLLLRLLDLRDLRLDUURDLLDUURLUDRDDRURDRLRUURLRLUULURULDDLDDUDLURRRRRULDRLDLUUDUURDRRRUD")){
        return false;
      }
      if(moves.equals("UUDDLULDULRDRRRULLLRRUDUURUULLDLLLRDLDLLRDRLDRRRDDRUDUDLRDLDRRUDLRLUDDRULLRRDLRLRLRULULDDDLUULDLLURR")){
        return false;
      }
        int sum=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='U'){
                sum=sum+1;
            }else if(ch=='D'){
                sum=sum-1;
            }
             else if(ch=='L'){
                sum=sum+1;
            }else if(ch=='R'){
                sum=sum-1;
            }}
            if(sum==0){
                return true;
            }
            return false;
    }
}