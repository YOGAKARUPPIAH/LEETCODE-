class Solution {
    public boolean checkRecord(String s) {


       boolean found =true;
int Acount=0;
String late="LLL";
       if(s.contains(late)){
        found=false;
       } 
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='A'){
            Acount++;
        }
        if(Acount>=2){
            found=false;
        }
       }
       return found;
    }
}