class Solution {
    public int countCommas(int n) {

      int temp=n;
     // int length=String.valueOf(Math.abs(temp)).length();
     int mcount=0;
if(n>=1000 )
{
 int count=Math.min(n,999999);
 mcount+=count-1000+1;
}if(n>=999999999 ){
    int count=Math.min(n,999999999);
    mcount+=(count-1000000+1)*2;
}
      return mcount;
    }
}