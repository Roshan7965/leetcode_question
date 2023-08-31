class Solution {

    public int minTaps(int n, int[] ranges) {
        
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        for(int i = 0; i <= n; i++) {
            
            // Skip if current range value is 0
            if(ranges[i] == 0)
                continue;
            
            // start area minimum is 0 or current index - current range
            int start = ((i - ranges[i]) < 0) ? 0 : (i - ranges[i]);
            // end area is maximum n or current index + current range 
            int end = (i+ranges[i] <= n) ? i+ranges[i] : n;
            
            // loop from start till end
            for(int j = start; j <= end; j++) { 

                if(i == 0 || start == 0) {
                // if i == 0 or start == 0, area within current range has 1 tap since it is at the 0 point or the current range can reach 0 point to the left.
                    dp[j] = 1;
                }
                else if(dp[start] != Integer.MAX_VALUE) {
                    // Get the minimum of the start value (since current range can reach till the start to the left) with one more tap addition (for current one) or the existing number of taps in the current position. 
                    dp[j] = Math.min(dp[start] + 1, dp[j]);
                }
            }
        }
        
        return (dp[n] == Integer.MAX_VALUE) ? -1 : dp[n];
    }
}

