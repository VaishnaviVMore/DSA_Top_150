class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        char[] str=s.toCharArray();
        int left=0;int right=n-1;
        while(left<=right){
            if(!isvowel(str[left])){
                left++;
            }
            else if(!isvowel(str[right])){
                right--;
            }
            else{
                char temp=str[left];
                str[left]=str[right];
                str[right]=temp;
                left++;right--;
            }
        }
        return new String(str);
    }
        public boolean isvowel(char ch){
            return "AEIOUaeiou".indexOf(ch)!=-1;
        }
}