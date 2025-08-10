class MyStack {
  Queue<Integer>qu=new LinkedList<>();
    public MyStack() {
        
    }
    //Queue<Integer>qu=new Queue<>();
    public void push(int x) {
        int s=qu.size();
        qu.add(x);
        for(int i=0;i<s;i++){
            qu.add(qu.poll());
        }
    }
    
    public int pop() {
        return qu.poll();
    }
    
    public int top() {
        return qu.peek();
    }
    
    public boolean empty() {
        return qu.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */