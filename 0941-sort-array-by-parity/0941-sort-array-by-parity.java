class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int even=0,t;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
               t=nums[even];
               nums[even]=nums[i];
               nums[i]=t;
               even++;
            }
        }
        return nums;
    }
}