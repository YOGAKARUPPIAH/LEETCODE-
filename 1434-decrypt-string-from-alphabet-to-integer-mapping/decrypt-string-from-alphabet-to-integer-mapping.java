class Solution {
    public String freqAlphabets(String s) {
        
        String ans="";
        for(int i=0;i<s.length();i++){
            if((i+2)<s.length() && s.charAt(i+2)=='#'){
                    int num=Integer.parseInt(s.substring(i,i+2));
                    char ch=(char)(num+'a'-1);
                    ans=ans+ch;
                    i=i+2;
            }else{
                int num=s.charAt(i)-'0';
                char ch=(char)(num+'a'-1);
                ans=ans+ch;
            }
        }
        return ans;
    }
}