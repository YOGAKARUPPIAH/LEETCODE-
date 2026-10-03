class Solution {
    public int getLucky(String s, int k) {
String n="";
    for(int j=0;j<s.length();j++){
            int num=s.charAt(j)-'a'+1;
        n+=num;
        }

  
int f = 0;
        for(int j = 0; j < n.length(); j++) {
            f += n.charAt(j) - '0';
        }
     for(int i=1;i<k;i++){
           int count=0;
        while(f>0){
            int dig=f%10;
            count+=dig;
            f=f/10;
        }
        f=count;
     }
     return f;
    }
}