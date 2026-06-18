class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int sum=0;
        List<Integer>ans=new ArrayList<>();
        int carry=0;
      for(int i=num.length-1;i>=0;i--){
        int digit=k%10;
            sum=digit+num[i]+carry;
            ans.add(sum%10);
            carry=sum/10;
            k=k/10;
      } 
      while(k > 0) {
            int digit = k % 10;
            sum = digit + carry;
            ans.add(sum % 10);
            carry = sum / 10;
            k = k / 10;
        }
        while(carry > 0) {
            ans.add(carry % 10);
            carry = carry / 10;
        }
      Collections.reverse(ans);
      return ans;
    }
}