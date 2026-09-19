class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        

        if(s.length()==2 && s.charAt(0)==s.charAt(1)){
            return 0;
        }
        if(s.length()==2){
            return -1;
        }
        int max=-1;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                if(sub.charAt(0)==sub.charAt(sub.length()-1)){
                    max=Math.max(max,sub.length());
                }
            }
        }
        return max-2;
    }
}