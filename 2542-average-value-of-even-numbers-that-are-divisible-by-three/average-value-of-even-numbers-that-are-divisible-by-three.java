class Solution {
    public int averageValue(int[] nums) {

boolean found=false;
     int count=0;
     int sum=0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]%3==0 && nums[i]%2==0){
            count++;
            sum+= nums[i];
            found=true;
        }
     }   
     if(found==true){
     int n=sum/count;
     return n;
     }
     return 0;
    }
}