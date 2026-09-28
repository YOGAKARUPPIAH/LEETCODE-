class Solution {
    public String mergeAlternately(String word1, String word2) {
        String mergeAlternately="";
int i=0;
int j=0;
        while(i < word1.length() || j < word2.length()){
            if(i < word1.length()) {
    mergeAlternately+= word1.charAt(i);
    i++;
}

if(j < word2.length()) {
    mergeAlternately+= word2.charAt(j);
    j++;
}
        }
        return mergeAlternately;
    }
}