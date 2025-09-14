class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        Stack<Integer>st=new Stack<>();
        int n=nums2.length;
        for(int i=n-1;i>=0;i--){
            int num=nums2[i];
            while(!st.isEmpty() && st.peek()<=num){
               st.pop(); 
            }
            int nextGreater=st.isEmpty()?-1:st.peek();
            hm.put(num,nextGreater);

            st.push(num);
        }
        int[] result=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i]=hm.get(nums1[i]);
        }
        return result;
    }
}