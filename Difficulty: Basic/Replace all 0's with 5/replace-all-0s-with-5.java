//{ Driver Code Starts
import java.lang.Math;
import java.util.Scanner;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new Solution().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends


class Solution {
    int convertfive(int num) {
        // Your code here
        String temp = Integer.toString(num);
        String res = temp.replace('0' , '5');
        int x = Integer.parseInt(res);
        return x;
    }
}