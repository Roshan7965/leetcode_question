class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int second=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target && first==-1){
                first=i;
                second=i;
            }else if(nums[i]==target){
                second=i;
            }
        }
        return new int[]{first,second};
    }
}