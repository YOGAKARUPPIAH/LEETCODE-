class Solution {
    public boolean isValid(String s) {
       while(true){
        int length=s.length();
        s=s.replace("[]","");
        s=s.replace("{}","");
        s=s.replace("()","");
          if(length==s.length()){
            break;
          }
       }
       return s.length()==0;
    }
}