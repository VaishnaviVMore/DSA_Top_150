class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str=s.split("\\s+");
        if(str.length!=pattern.length())return false;
        HashMap<String,Character>hm=new HashMap<>();
        for(int i=0;i<str.length;i++){
            String word=str[i];
            char c=pattern.charAt(i);
            if(hm.containsKey(word)){
                if(!hm.get(word).equals(c)) return false;
            }
            else{
                if(hm.containsValue(c))return false;
                    hm.put(word,c);
            }
        }
        return true;
    }
}