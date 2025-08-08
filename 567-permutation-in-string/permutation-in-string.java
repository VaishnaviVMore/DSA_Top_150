class Solution {
    public boolean matches(int freq[], int freq1[]){
        for(int i=0;i<26;i++){
            if(freq[i]!=freq1[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] freq = new int[26];

        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        int windsize=s1.length();
        for(int i=0;i<s2.length();i++){
            int windind=0;int ind=i;
            int[] wind = new int[26];
            while(windind<windsize && ind<s2.length()){
                wind[s2.charAt(ind)-'a']++;
                windind++;ind++;
            }
            if(matches(freq, wind)){
                return true;
            }
        }
        return false;
    }
}