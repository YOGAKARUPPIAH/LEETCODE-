class Solution{
    public String mostCommonWord(String paragraph,String[] banned){

        paragraph=paragraph.toLowerCase();

        String[] words=paragraph.split("[!?',;. ]+");

        HashMap<String,Integer> map=new HashMap<>();

        for(int i=0;i<words.length;i++){

            if(!map.containsKey(words[i])){
                map.put(words[i],1);
            }else{
                map.put(words[i],map.get(words[i])+1);
            }
        }

        String ans="";
        int max=0;

        for(int i=0;i<words.length;i++){

            boolean found=false;

            for(int j=0;j<banned.length;j++){
                if(words[i].equals(banned[j])){
                    found=true;
                    break;
                }
            }

            if(found==false && map.get(words[i])>max){
                max=map.get(words[i]);
                ans=words[i];
            }
        }

        return ans;
    }
}