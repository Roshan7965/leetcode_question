class Solution {
    public int countOrders(int n) {
        int MOD =(int)1e9 +7;
        long [] dp=new long[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1]*(2*i-1)*i%MOD;
        }
        return (int) dp[n];         
    }
}