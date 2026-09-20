class Solution {
    public int reverseDegree(String s) {
        
        int sum=0;
        for(int i=0;i<s.length();i++){
            int num=s.charAt(i)-'a'+1;
            int yoo=26-num+1;
            sum=sum+(yoo*(i + 1));
        }
        return sum;
    }
}