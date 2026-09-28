class Solution {
    public String firstPalindrome(String[] words) {
        String firstPalindrome="";
        for(int i=0;i<words.length;i++){
            String word=words[i];
            String rev=new StringBuilder(word).reverse().toString();
            if(word.equals(rev)){
                firstPalindrome=word;
                break;
            }
        }
        return firstPalindrome;
    }
}