class Solution {
    public boolean isPalindrome(String s) {
        String str=s.trim().toLowerCase().replaceAll("[^a-z0-9]","");
        int n=str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}