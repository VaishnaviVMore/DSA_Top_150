class Solution {
    public String reverseWords(String s) {
        StringBuilder Sb=new StringBuilder();
        String[] str=s.trim().split("\\s+");
        int n=str.length;
        for(int i=n-1;i>=0;i--){
            Sb.append(str[i]);
            if(i!=0){
                Sb.append(' ');
            }
        }
        return Sb.toString();
    }
}