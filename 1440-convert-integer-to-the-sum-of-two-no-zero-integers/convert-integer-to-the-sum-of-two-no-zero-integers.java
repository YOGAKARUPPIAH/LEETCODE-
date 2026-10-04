class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr = new int[2];
        int a = 1;
        int b = n - 1;
        while(a <= b) {
            if(!String.valueOf(a).contains("0") && !String.valueOf(b).contains("0")) {
                arr[0] = a;
                arr[1] = b;
                return arr;
            }
            a++;
            b--;
        }
        return arr;
    }
}