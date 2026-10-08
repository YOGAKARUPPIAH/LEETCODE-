class Solution {
    public int countPrefixes(String[] words, String s) {
        
        int count=0;

        for(int i=0;i<words.length;i++){
            boolean found =true;
  if(words[i].length() > s.length()) {
                continue;
            }
            for(int j=0;j<words[i].length();j++){
             if(s.charAt(j)!=words[i].charAt(j)){
                found=false;
                break;
            }
        }
        if(found==true){
            count++;
        }
        }
        return count;
    }
}