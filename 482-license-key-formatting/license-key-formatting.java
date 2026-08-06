class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String s1=s.replace("-","");
        String ans=new StringBuilder(s1).reverse().toString().toUpperCase();
        String fans="";
        int count=0;
        for(int i=0;i<ans.length();i++){
            
            if(count==k){
                fans=fans+'-';
                count=0;
                i--;
            }else{
                fans=fans+ans.charAt(i);
                count++;
            }
            }
            String yoo=new StringBuilder(fans).reverse().toString();
        
        return yoo;
    }}
