class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
int count=0;
        for(int i=0;i<words.length;i++){
            String word=words[i];

            HashSet<Character>set=new HashSet<>();

            for(int k=0;k<allowed.length();k++){
                set.add(allowed.charAt(k));
            }

            for(int j=0;j<word.length();j++){
                set.add(word.charAt(j));
                    }
                    if(set.size()==allowed.length()){
                        count++;
                    }
                }
                return count;
            }
        }