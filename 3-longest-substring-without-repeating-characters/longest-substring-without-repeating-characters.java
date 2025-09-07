class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int left=0;int maxlen=0;
        HashSet<Character>hs=new HashSet<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            while(hs.contains(ch)){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(ch);
            maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}