class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int k=n1+n2;
        int[] arr=new int[k];
           int i=0; int j=0;int l=0; 
            while(j<n1 && l<n2){
                if(nums1[j]>nums2[l]){
                    arr[i++]=nums2[l++];
                }
                else{
                    arr[i++]=nums1[j++];
                }
            }
            while(j<n1){
                arr[i++]=nums1[j++];
            }
             while(l<n2){
                arr[i++]=nums2[l++];
            }
        if(k%2==0){
            return (arr[k/2-1] + arr[k/2])/2.0;
        }
        else{
            return arr[k/2];
        }
    }
}