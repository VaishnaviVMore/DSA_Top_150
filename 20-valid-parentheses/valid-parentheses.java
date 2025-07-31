class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character>St=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' ||ch=='{' ){
                St.push(ch);
            }
            else {
            if(St.isEmpty()){
                return false;
            }
            if((St.peek()=='('&& ch==')')||
            (St.peek()=='['&& ch==']')||
            (St.peek()=='{'&& ch=='}')){
                St.pop();
            }
            else{
                return false;
            }
        }
    }
        return St.isEmpty();
    }
}