#User function Template for python3

class Solution:
    def switchCase(self, choice, arr):
        # Code here
        if(choice == 1):
                circle = 3.141592653589793*arr[0]*arr[0]
                return circle
        elif(choice == 2):
                rect = arr[0]*arr[1]
                return rect;
        else:
            return 0;
#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int(input ())
    for _ in range (t):
        choice = int(input())
        arr = list(map(int, input().split()))
        ob = Solution()
        if choice == 1:
            res = ob.switchCase(choice, arr)
            print("%.2f"%round(res,2))
        else:
            res = ob.switchCase(choice, arr)
            print(int(res))

# } Driver Code Ends