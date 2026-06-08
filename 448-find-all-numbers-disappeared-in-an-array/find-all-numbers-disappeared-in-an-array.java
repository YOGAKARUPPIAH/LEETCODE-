class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int n = 1;
        for(int i = 0; i < nums.length; i++) {
            while(n < nums[i]) {
                list.add(n);
                n++;
            }
            if(n == nums[i]) {
                n++;
            }
        }
        while(n <= nums.length) {
            list.add(n);
            n++;
        }

        return list;
    }
}