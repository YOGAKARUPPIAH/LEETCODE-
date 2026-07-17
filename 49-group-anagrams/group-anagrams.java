class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>>map=new HashMap<>();
       for(String word:strs){
        char[]arr=word.toCharArray();
        Arrays.sort(arr);
        String sort=new String(arr);
        if(!map.containsKey(sort)){
            map.put(sort,new ArrayList<>());
        }

        map.get(sort).add(word);
       } 
       return new ArrayList<>(map.values());
    }
}