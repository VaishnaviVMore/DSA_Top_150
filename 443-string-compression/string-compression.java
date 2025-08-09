class Solution {
    public int compress(char[] chars) {
        int read=0;
        int write=0;
        while(read<chars.length){
            int count=0;
            char currch=chars[read];
            while(read<chars.length && chars[read]==currch){
                read++;
                count++;
            }
            chars[write++]=currch;
             if(count>1){
            for(char inti : Integer.toString(count).toCharArray()){
                chars[write++]=inti;
            }
        }
        }
        return write;
    }
}