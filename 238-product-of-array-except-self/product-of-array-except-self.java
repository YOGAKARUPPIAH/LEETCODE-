/*class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
int []ans=new int[n];
       
        for(int i=0;i<n;i++){
            long pro=1;
            for(int j=0;j<n;j++){
            if(i==j){
                continue;
            }
            pro=pro*nums[j];
            }
            ans[i]=(int)pro;
        }
        return ans;
    }
}*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int left = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = left;
            left = left * nums[i];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * right;
            right = right * nums[i];
        }
        return ans;
    }
}