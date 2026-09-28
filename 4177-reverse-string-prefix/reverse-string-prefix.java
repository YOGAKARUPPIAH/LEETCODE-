class Solution {
    public String reversePrefix(String s, int k) {
        String word="";

        String p=s.substring(0,k);
        String rev=new StringBuilder(p).reverse().toString();
        word=rev+s.substring(k);
        return word;

    }
}