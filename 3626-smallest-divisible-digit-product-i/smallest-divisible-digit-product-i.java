class Solution {
    public int smallestNumber(int n, int t) {

        while (true) {

            int num = n;
            int pro = 1;
            while (num > 0) {
                int dig = num % 10;
                pro = pro * dig;
                num = num / 10;
            }
            if (pro % t == 0) {
                return n;
            } else {
                n++;
            }
        }
    }
}