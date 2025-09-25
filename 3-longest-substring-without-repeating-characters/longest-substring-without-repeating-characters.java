class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int left=0;
        int maxlen=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            if(hm.containsKey(ch)){
                left=Math.max(hm.get(ch)+1,left);
            }
            hm.put(ch,right);
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}