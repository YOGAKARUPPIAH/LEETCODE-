class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxlength = 0;
        int start =0;
      HashSet<Character>set=new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            if(right-left+1 > maxlength){
                    maxlength=right-left+1;
                    start=left;
            }
          
        }
        return maxlength;       
    }
}