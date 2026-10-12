class Solution {
    public int totalMoney(int n) {
        
        int amt=0;
        int num=1;
        int day=1;
        for(int i=1;i<=n;i++){
            
            amt=amt+num;
            num++;
            day++;
        if(day==8){
            day=1;
            num=num-6;
        }
    }
    return amt;
}}