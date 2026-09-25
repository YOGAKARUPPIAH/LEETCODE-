class Solution {
    public String thousandSeparator(int n) {
     
String s=""+n;
String ans="";
int count=0;
for(int i=s.length()-1;i>=0;i--){
    ans=ans+s.charAt(i);
    count++;
    if(count==3 && i!=0){
        ans=ans+".";
    count=0;
    }
}
String rev=new StringBuilder(ans).reverse().toString();
        return rev;
    }
}