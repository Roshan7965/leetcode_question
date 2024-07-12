class Solution {
    Integer []dp;
    public int fib(int n) {
        dp=new Integer[n+1];
        return fibHelp(n);
    }
    public int fibHelp(int n){
        if(n==0||n==1){
            return n;
        }
        if(dp[n]!=null){
            return dp[n];
        }
        int ans=fibHelp(n-1)+fibHelp(n-2);
        dp[n]=ans;
        return ans;
    }
}