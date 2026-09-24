class Solution {
    public int maxPower(String s) {
        
        int max=1;
int count=1;
        for(int i=0;i<s.length();i++){
            
            if(i+1 <s.length() && s.charAt(i)==s.charAt(i+1)  ){
                count++;
            }else{
                max=Math.max(max,count);
                count=1;
            }
            
        }
        
        return max;
    }
}