class Solution {
    public boolean isSameAfterReversals(int num) {
        int og=num;
     if(num==0){
        return true;
     } 
     int num1=0;
     while(num!=0){
        int digit=num%10;
       num1=num1*10+digit;
       num=num/10; 
     }  
int num2=0;
     while(num1!=0){
    int digit=num1%10;
       num2=num2*10+digit;
       num1=num1/10; 
     }
     if(og==num2){
        return true;
     }else{
        return false;
     }
    }
}