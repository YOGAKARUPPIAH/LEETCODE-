class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        if(nums.length==0){
            return 0;
        }
         int max=Integer.MIN_VALUE;
        for(int num:set){
            int current=num;
            int length=1;
            if(!set.contains(num-1)){
                while(set.contains(current+1)){
                    length++;
                    current++;
                }
                max=Math.max(length,max);
            }
        } 
        return max;
    }
}