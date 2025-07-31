class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer>list=new HashSet<>();
        for(int j=0;j<arr.length;j++){
            if(list.contains(arr[j]*2) || (arr[j]%2==0 && list.contains(arr[j]/2))){
                return true;
            }
            list.add(arr[j]);
        }
        return false;
    }
}