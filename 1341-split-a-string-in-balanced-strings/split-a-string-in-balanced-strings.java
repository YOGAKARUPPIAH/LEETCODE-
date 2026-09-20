class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
int max=0;
        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);
            if(ch=='R'){
                count++;
            }else{
                count--;
            }

            if(count==0){
                max++;
            }
        }
        return max;
    }
}