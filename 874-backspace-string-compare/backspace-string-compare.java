class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        StringBuilder s1= new StringBuilder();
        StringBuilder t1= new StringBuilder();
boolean found =false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                s1.append(s.charAt(i));
            }else{
               if (s1.length() > 0) {
                s1.deleteCharAt(s1.length() - 1);
            }
            }
        }

        for(int i=0;i<t.length();i++){
            if(t.charAt(i)>='a' && t.charAt(i)<='z'){
                t1.append(t.charAt(i));
            }else{
               if (t1.length() > 0) {
                t1.deleteCharAt(t1.length() - 1);
            }
            }
        }
        if(s1.toString().equals(t1.toString())){
            found =true;
        }
        return found;
    }
}