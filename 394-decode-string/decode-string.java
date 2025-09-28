class Solution {
    public String decodeString(String s) {
        Stack<String>st1=new Stack<>();
        Stack<Integer>st2=new Stack<>();
        String curr="";
        int num=0;
        
       for(char ch: s.toCharArray()){
        if(Character.isDigit(ch)){
            num=num*10+(ch-'0');
        }
        else if(ch=='['){
            st1.push(curr);
            st2.push(num);
            curr="";
            num=0;
        }
        else if(ch==']'){
            int up=st2.pop();
            String str=st1.pop();
            StringBuilder sb=new StringBuilder(str);
            for(int i=0;i<up;i++){
                sb.append(curr);
            }
            curr=sb.toString();
        }
        else{
            curr+=ch;
        }
       }
       return curr;
    }
}