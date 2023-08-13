class Solution {
    public int maxSubArray(int[] nums) {
        int maxisum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<nums.length;i++){
            if(currsum<0){
                currsum=0;
            }
            currsum+=nums[i];
            maxisum=Math.max(maxisum,currsum);

        }
        return maxisum;

    }
}