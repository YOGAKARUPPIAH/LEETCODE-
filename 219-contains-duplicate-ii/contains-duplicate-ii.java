class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
   /* boolean found=false;
        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    int num=Math.abs(i-j);
                    if(num<=k){
                        found=true;
                    } 
                }
            }
        }
        return found;  */

HashMap<Integer,Integer>map=new HashMap<>();
for(int i=0;i<nums.length;i++){
    if(map.containsKey(nums[i])){
         if(i-map.get(nums[i])<=k){
            return true;

    }
}
map.put(nums[i],i);
}
return false;

    
}}