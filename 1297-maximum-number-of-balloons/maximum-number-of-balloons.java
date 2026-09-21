class Solution {
    public int maxNumberOfBalloons(String text) {
/*
int count=0;
while(text.length()>=7){
       if(text.contains("b")){
        text=text.replaceFirst("b","");

         if(text.contains("a")){
        text=text.replaceFirst("a","");

         if(text.contains("l")){
        text=text.replaceFirst("l","");

         if(text.contains("l")){
        text=text.replaceFirst("l","");

         if(text.contains("o")){
        text=text.replaceFirst("o","");

        if(text.contains("o")){
        text=text.replaceFirst("o","");

        if(text.contains("n")){
        text=text.replaceFirst("n","");
        
        count++;
       }else{
        break;
       }}
       else{
        break;
       }}
       else{
        break;
       }}
       else{
        break;
       }}
       else{
        break;
       }}
       else{
        break;
       }}
       }
     return count; */

     
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'b') {
                b++;
            } else if (ch == 'a') {
                a++;
            } else if (ch == 'l') {
                l++;
            } else if (ch == 'o') {
                o++;
            } else if (ch == 'n') {
                n++;
            }
        }
        l = l / 2;
        o = o / 2;
        int count = b;
        if (a < count) {
            count = a;
        }
        if (l < count) {
            count = l;
        }
        if (o < count) {
            count = o;
        }
        if (n < count) {
            count = n;
        }
        return count;
    }
}
    