class pair{
    int val;
    int min;
    public pair(int val,int min){
        this.val=val;
        this.min=min;
    }
}

class MinStack {
     Stack<pair>st=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(new pair(val,val));
        }
        else{
            int min=Math.min(st.peek().min,val);
            st.push(new pair(val,min));
        }
    }
    
    public void pop() {
        if(!st.isEmpty()){
            st.pop();
        }
    }
    
    public int top() {
        return st.peek().val;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */