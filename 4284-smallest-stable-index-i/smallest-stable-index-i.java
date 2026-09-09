class Solution {
    public int firstStableIndex(int[] nums, int k) {
       
     if(nums.length==1){
        return 0;
     }

        for(int i=0;i<nums.length;i++){
            int max=nums[0];
            for(int j=0;j<=i;j++){
                max=Math.max(max,nums[j]);
            }

            int min=nums[i];
            for(int l=i;l<nums.length;l++){
                min=Math.min(min,nums[l]);
            }
            int diff=max-min;
            if(diff<=k){
                return i;
            }
        }
        return -1;
    }
}