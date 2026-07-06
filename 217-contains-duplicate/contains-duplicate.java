class Solution {
    public boolean containsDuplicate(int[] nums) {
     /*   HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
                return false; */
                HashMap<Integer,Integer>map=new HashMap<>();
                
                for(int x:nums){
                    map.put(x,map.getOrDefault(x,0)+1);
                
                if(map.get(x)>1){
                    return true;
                }}
                return false;
              }

        }