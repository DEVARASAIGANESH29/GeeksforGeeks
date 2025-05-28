class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        int slargest = -1;
        int largest = arr[0];
        for(int i=0;i<n;i++){
            if(largest < arr[i]){
                slargest = largest;
                largest = arr[i];
            }
            else if(largest != arr[i] && slargest < arr[i]){
                slargest = arr[i];
            }
        }
        return slargest;
    }
}