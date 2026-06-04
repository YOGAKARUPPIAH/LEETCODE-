class Solution {
    public boolean checkPerfectNumber(int num) {
       int sum=0;
       int og=num;
       for(int i=1;i<num;i++){
        if(num%i==0){
            sum=sum+i;
        }
       }
       if(sum==og){
        return true;
       } else{
        return false;
       }
    }
}