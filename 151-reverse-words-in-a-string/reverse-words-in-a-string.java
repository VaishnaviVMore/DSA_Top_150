class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] str=s.split("\\s+");
        int n=str.length;
        //String ans=new String[n];
        
        for(int i=0;i<n/2;i++){
            String temp=str[i];
            str[i]=str[n-i-1];
            str[n-i-1]=temp;
        }
        return String.join(" ",str);
    }
}