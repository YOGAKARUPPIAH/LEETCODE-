class Solution {
    public int maxSubArray(int[] nums) {

   /*     int[]prefix=new int[nums.length];
         prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
        prefix[i]=prefix[i-1]+nums[i];
    }
int max=Integer.MIN_VALUE;
for(int i=0;i<nums.length;i++){
    for(int j=i;j<nums.length;j++){
        int sum=0;
        if(i==0){
            sum=prefix[j];
        }else{
        sum=prefix[j]-prefix[i-1];
    }
    max=Math.max(max,sum);
}}*/

int sum=nums[0];
int maxsum=nums[0];
for(int i=1;i<nums.length;i++){
    if(sum>=0){
        sum=sum+nums[i];
    }else{
        sum=nums[i];
    }
    if(maxsum<sum){
        maxsum=sum;
    }
}
return maxsum;
}}