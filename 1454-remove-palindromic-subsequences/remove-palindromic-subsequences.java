class Solution {
    public int removePalindromeSub(String s) {
        
        String s1=new StringBuilder(s).reverse().toString();
        if(s.equals(s1)){
            return 1;
        }
        return 2;
    }
}