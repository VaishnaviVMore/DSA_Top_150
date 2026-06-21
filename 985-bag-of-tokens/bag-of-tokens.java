class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int maxscore=0;
        Arrays.sort(tokens);
        int i=0;
        int j=tokens.length-1;
        int score=0;
        while(i<=j){
           
            if(power>=tokens[i]){
                power-=tokens[i];
                score++;
                i++;
                maxscore=Math.max(score,maxscore);
            }
            else if(score>=1 && i<j){
                power+=tokens[j];
                score--;
                j--;
            }
            else {
                return maxscore;
            }
        }
        return maxscore;
    }
}