class Solution {
    public boolean isPalindrome(String s) {
        String str=s.trim().replaceAll("[^A-Za-z0-9]","").toLowerCase();
        //boolean flag=true;
        int n=str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                //flag=false;
                return false;
                //break;
            }
        }
        
        return true;
    }
}