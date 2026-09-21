class Solution {
    public String sortString(String s) {
        
        String ans="";
        String alp = "abcdefghijklmnopqrstuvwxyz";
        int[]count= new int[26];
        
        for(int i=0;i<26;i++){
                int num=0;
            for(int j=0;j<s.length();j++){
                if(alp.charAt(i)==s.charAt(j)){
                    num++;
                }}
                count[i]=num;
                
            
        }
while(ans.length() < s.length()) {

        for(int i=0;i<count.length;i++){
            if(count[i]>0){
                ans=ans+(char)('a'+i);
                count[i]--;
            }}
                for(int j=25;j>=0;j--){
                    if(count[j]>0){
                        ans=ans+(char)('a'+j);
                   count[j]--;
                    }
                }
            }
        return ans;
    }
}