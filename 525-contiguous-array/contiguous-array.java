class Solution {
    public int findMaxLength(int[] nums) {
      /*  int max=0;
        for(int i=0;i<nums.length;i++){
            int zero=0;
            int one=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0){
                    zero++;
                }else{
                    one++;
                }
            
            if(one==zero){
                max=Math.max(max,j-i+1);
            }
        }}
        return max;*/
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0)
                sum--;
            else
                sum++;

            if(map.containsKey(sum)) {

                max = Math.max(max, i - map.get(sum));

            } else {

                map.put(sum, i);
            }
        }

        return max;
    }
}
