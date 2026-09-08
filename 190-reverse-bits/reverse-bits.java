class Solution{
    public int reverseBits(int n){
        String nu=Integer.toBinaryString(n);
        while(nu.length()<32){
            nu="0"+nu;
        }
        String bin="";
        for(int i=31;i>=0;i--){
            bin=bin+nu.charAt(i);
        }
        return (int)Long.parseLong(bin,2);
    }
}