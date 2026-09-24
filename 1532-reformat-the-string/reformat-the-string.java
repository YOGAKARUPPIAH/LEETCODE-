class Solution {
    public String reformat(String s) {
        String alp="";
        String num="";
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z')
                alp+=s.charAt(i);
            else
                num+=s.charAt(i);
        }

        if(Math.abs(alp.length()-num.length())>1)
            return "";
            
        if(alp.length()>num.length()){
            for(int i=0;i<num.length();i++)
                ans+=alp.charAt(i)+""+num.charAt(i);
            ans+=alp.charAt(alp.length()-1);
        }else{
            for(int i=0;i<alp.length();i++)
                ans+=num.charAt(i)+""+alp.charAt(i);
            if(num.length()>alp.length())
                ans+=num.charAt(num.length()-1);
        }
        return ans;
    }
}