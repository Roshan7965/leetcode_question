class Solution {
    Integer dp[];
    public int fib(int n) {
        dp=new Integer[n+1];
        return findHelp(n);
        
    }
    public int findHelp(int n){
        if(n==1 || n==0){
            return n;
        }
        if(dp[n]!=null){
            return dp[n];
        }
        int ans=findHelp(n-1)+findHelp(n-2);
        dp[n]=ans;
        return ans;
    }
}