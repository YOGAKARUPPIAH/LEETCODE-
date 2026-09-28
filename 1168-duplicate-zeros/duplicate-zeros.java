class Solution {
    public void duplicateZeros(int[] arr) {
        int[] num = new int[arr.length];
        int c = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]==0) {
                if(c<arr.length) {
                    num[c]=0;
                    c++;
                }
                if(c<arr.length) {
                    num[c] = 0;
                    c++;
                }
            }else{
                if(c<arr.length) {
                    num[c]=arr[i];
                    c++;
                }}}
        for(int i=0;i<arr.length;i++) {
            arr[i]=num[i];
        }
    }
}