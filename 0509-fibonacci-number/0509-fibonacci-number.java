class Solution {
    // (Using memoization)
    // public int solve(int n , int dp[]){
    //     if(n<=1) return n;
    //     if(dp[n]!=-1) return dp[n];

    //     dp[n]= solve(n-1,dp)+solve(n-2,dp);
    //     return dp[n];
    // }

        //(using tabulation)
    public int solve(int n){
        if(n<=1) return n;
        int prev1=1;
        int prev2=0;

        for(int i=2;i<=n;i++){
            int curr_i=prev1+prev2;
            prev2=prev1;
            prev1=curr_i;
        }
        return prev1;
        
    }
    public int fib(int n) {
        return solve(n);
    }
    
}