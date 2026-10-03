class Solution {
    public boolean areOccurrencesEqual(String s) {
        boolean found=false;
int num=0;
        for(int i=0;i<s.length();i++){
            int count=0;
for(int j=0;j<s.length();j++){
if(s.charAt(i)==s.charAt(j)){
    count++;
}
}
  if(i==0){
                num=count;
            }
            if(count!=num) {
                return false;
            } }
        return true;
        }
    }
