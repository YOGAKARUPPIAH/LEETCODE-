class Solution {
    public int dominantIndex(int[] nums) {
        
        int max=nums[0];
        int num=0;
        for(int i=1;i<nums.length;i++){
                if(max<nums[i]){
                    max=nums[i];
                    num=i;
                }
        }
        for(int i=0;i<nums.length;i++){
            if(i!=num && max < 2*nums[i]){
                return -1;
            }
        }
        return num;
    }
}