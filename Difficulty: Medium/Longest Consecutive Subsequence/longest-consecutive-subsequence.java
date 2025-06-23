class Solution {
    public int longestConsecutive(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        
        Arrays.sort(arr);
        int count = 1;
        int maxi = 1;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                continue;
            }
            if (arr[i] - arr[i - 1] == 1) {
                count++;
            } else {
                maxi = Math.max(maxi, count);
                count = 1;
            }
        }
        
        return Math.max(maxi, count);
    }
}
