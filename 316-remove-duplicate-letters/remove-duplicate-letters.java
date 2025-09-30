class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastOcc=new int[26];
        for(int i=0;i<s.length();i++){
            lastOcc[s.charAt(i)-'a']=i;
        }
        Stack<Character>st=new Stack<>();
        boolean[] seen=new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int curr=ch-'a';
            if(seen[curr]){
                continue;
            }
            while(!st.isEmpty() && lastOcc[st.peek()-'a']>i && st.peek()>ch){
                seen[st.peek()-'a']=false;
                st.pop();
            }
            st.push(ch);
            seen[curr]=true;
        }
        StringBuilder sb=new StringBuilder();
        while(st.size()>0){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}