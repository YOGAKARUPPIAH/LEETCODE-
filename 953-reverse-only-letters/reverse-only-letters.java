class Solution {
    public String reverseOnlyLetters(String s) {
        String letter="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z'))
{
    letter=letter+s.charAt(i);
}        }

String l=new StringBuilder(letter).reverse().toString();

int c=0;
String fin="";

for(int i=0;i<s.length();i++){
    if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')){
        fin=fin+l.charAt(c);
        c++;
    }else{
        fin=fin+s.charAt(i);
    }
}
return fin;
    }
}