class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int n=candyType.length;
        int maxtype=1;
        for(int i=0;i<n-1;i++){
            if(candyType[i]==candyType[i+1]) continue;
            else{
                maxtype++;
            }
        }
        int mintype=n/2;
       return Math.min(maxtype,mintype);
    }
}