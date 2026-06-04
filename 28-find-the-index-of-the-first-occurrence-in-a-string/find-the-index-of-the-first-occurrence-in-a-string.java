class Solution {
    public int strStr(String haystack, String needle) {
        int c=0;
        if(haystack.contains(needle)){
           return haystack.indexOf(needle);
        }
            return -1;
        
    }
}