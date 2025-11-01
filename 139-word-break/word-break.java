class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        Set<String> wordset=new HashSet<>(wordDict);
        int maxlen=0;
        for(String word: wordset){
            maxlen=Math.max(maxlen,word.length());
        }
        boolean[] dp=new boolean[n+1];
        dp[0]=true;
        for(int i=1;i<=n;i++){
            for(int j=i-1;j>=Math.max(0,i-maxlen);j--){
                if(dp[j] && wordset.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
}