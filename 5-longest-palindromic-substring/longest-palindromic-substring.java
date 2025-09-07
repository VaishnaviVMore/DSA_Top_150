class Solution {
    public static String expand(String s, int left, int right){
        while(left>=0 && right<s.length()&& s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
    public String longestPalindrome(String s) {
        String longest="";
        int n=s.length();
        for(int i=0;i<n;i++){
            String odd=expand(s,i,i);
            String even=expand(s,i,i+1);
            String current=odd.length()>even.length()?odd:even;
            if(current.length()>longest.length()){
                longest=current;
            }
        }
        return longest;
    }
}