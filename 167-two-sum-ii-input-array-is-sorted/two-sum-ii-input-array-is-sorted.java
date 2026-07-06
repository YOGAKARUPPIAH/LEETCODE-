class Solution {
    public int[] twoSum(int[] numbers, int target) {
       for(int k=0;k<numbers.length;k++){
        for(int i=k+1;i<numbers.length;i++){
            if(numbers[k]+numbers[i]==target){
                  return new int[]{k+1, i+1};
            }
        }
       } 
         return new int[]{};
    }
}