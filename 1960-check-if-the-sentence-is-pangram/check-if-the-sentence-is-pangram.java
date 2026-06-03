class Solution {
    public boolean checkIfPangram(String sentence) {
        int count=0;
       for(char ch='a';ch<='z';ch++){
        if(sentence.indexOf(ch)==-1){
            return false;
        }
       }
      return true;  
    }
}