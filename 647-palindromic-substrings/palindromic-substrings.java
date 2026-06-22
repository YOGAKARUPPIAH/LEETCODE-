class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
             
               StringBuilder rev = new StringBuilder(sub);

          if(sub.equals(rev.reverse().toString())){
    count++;
}

            }
        }
        return count;
    }
}