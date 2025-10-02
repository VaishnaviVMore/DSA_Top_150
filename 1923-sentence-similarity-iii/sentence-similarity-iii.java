class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        //sent1 is small and sen2 is large
        if(sentence1.length()>sentence2.length()){
            return areSentencesSimilar(sentence2, sentence1);
        }
        String[] small=sentence1.split("\\s+");
        String[] large=sentence2.split("\\s+");
        int start=0;
        int end1=small.length-1;
        int end2=large.length-1;
        while(start<=end1 && small[start].equals(large[start])){
            start++;
        }
        while(start<=end1 && small[end1].equals(large[end2])){
            end1--;end2--;
        }
        return (start>end1);
    }
}