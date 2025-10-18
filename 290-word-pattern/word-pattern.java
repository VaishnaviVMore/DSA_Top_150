class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String, Character>hm=new HashMap<>();
        int n=pattern.length();
        String[] str=s.split("\\s+");
        if(n!=str.length){
            return false;
        }
        for(int i=0;i<n;i++){
            char ch=pattern.charAt(i);
            if(hm.containsKey(str[i])) {
                if(!hm.get(str[i]).equals(ch)) return false;
            }
            else{
                if(hm.containsValue(ch)) return false;
                hm.put(str[i],ch);
            }
            
        }
        return true;
    }
}