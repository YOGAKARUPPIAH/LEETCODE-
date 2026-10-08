class Solution {
    public String trimTrailingVowels(String s) {
        String ans = "";
        boolean found = false;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(found == false) {
                if(s.charAt(i) == 'a' ||s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u') {
                    continue;
                } else {
                    found = true;
                    ans += s.charAt(i);
                }
            } else {
                ans += s.charAt(i);
            }
        }
        String result = "";
        for(int i = ans.length() - 1; i >= 0; i--) {
            result += ans.charAt(i);
        }
        return result;
    }
}