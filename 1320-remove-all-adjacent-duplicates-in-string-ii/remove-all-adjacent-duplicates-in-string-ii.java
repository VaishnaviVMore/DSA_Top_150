class Solution {
    class Node{
        char data;
        int freq;
        Node(char d, int f){
            this.data=d;
            this.freq=f;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Node>st=new Stack();
        for(char c:s.toCharArray()){
            if(!st.isEmpty() && st.peek().data==c){
                Node curr=st.pop();
                curr.freq+=1;
                st.push(curr);
            }
            else{
                st.push(new Node(c,1));
            }
            if(st.peek().freq==k){
                st.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            Node re=st.pop();
            int fre=re.freq;
            while(fre-->0){
                sb.append(re.data);
            }
        }
        return sb.reverse().toString();
        }   
         }