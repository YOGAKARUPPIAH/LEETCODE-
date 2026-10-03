class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        boolean found=false;
        for(int i=0;i<s.length()-1;i++){
            
            if((i+1)<s.length() &&  Math.abs((s.charAt(i)-'0')-(s.charAt(i+1)-'0'))<=2) {
                found=true;
            }else{
                found =false;
                break;
            }
        }
        return found;
    }
}