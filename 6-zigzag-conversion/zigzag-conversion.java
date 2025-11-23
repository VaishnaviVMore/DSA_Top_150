class Solution {
    public String convert(String s, int numRows) {
        String[] str=new String[numRows];
        for(int i=0;i<numRows;i++){
            str[i]="";
        }
        int i=0;
        while(i<s.length()){
            for(int ind=0;ind<numRows && i<s.length();ind++){
                str[ind]+=s.charAt(i++);
            }
            for(int ind=numRows-2;ind>0 && i<s.length();ind--){
                str[ind]+=s.charAt(i++);
            }
        }
        String res="";
        for(String st: str){
            res+=st;
        }
        return res;
    }
}