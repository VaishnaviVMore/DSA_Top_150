class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split("\\s+");
        int n=str.length;
        return str[n-1].length();
    }
}