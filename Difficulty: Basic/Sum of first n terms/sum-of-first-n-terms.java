//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.sumOfSeries(N));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java


class Solution {
    int sums(int n, int sum) {
        if(n > 1){
            return sums(n-1,sum+n*n*n);
        }
        return sum+n*n*n;
    }

    int sumOfSeries(int n) {
        return sums(n, 0);
    }
}
