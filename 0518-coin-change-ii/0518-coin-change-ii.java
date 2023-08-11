class Solution {
    static int n;
   
    public int change(int amount, int[] coins) {
        n=coins.length;
        int [][]t=new int[n+1][amount+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<amount+1;j++){
                t[i][j]=-1;
            }
        }
        return solve(0,amount,coins,t);
    }

    public static int  solve(int i,int amount,int []coins,int t[][]){
        if(amount==0){
            return 1;
        }
        if(i==n){
            return 0;
        }
        if(t[i][amount]!=-1){
            return t[i][amount];
        }
        if(coins[i]>amount){
            return t[i][amount]=solve(i+1,amount,coins,t);
        }
        int take=solve(i,amount-coins[i],coins,t);
        int skip=solve(i+1,amount,coins,t);
        return t[i][amount]=take+skip;
    }
}