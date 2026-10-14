class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int sum= 0;
        while(mainTank >= 5) {
            sum+=5*10;
            mainTank-=5;
            if(additionalTank>0) {
                mainTank+=1;
                additionalTank -= 1;
            }
        }
        sum += mainTank * 10;
        return sum;
    }
}