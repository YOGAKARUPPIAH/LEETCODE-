class Solution {
    public String reverseWords(String s) {
        String[]arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            String rev="";
            for(int j=arr[i].length()-1;j>=0;j--){
                rev=rev+arr[i].charAt(j);

            }
            arr[i]=rev;
        }
       return String.join(" ", arr);
    }
}