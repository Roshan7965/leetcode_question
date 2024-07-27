class Solution {
    public int[] rearrangeArray(int[] nums) {
        int even=0;
        int odd=1;
        int []res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
               res[even]=nums[i];
               even+=2;
            }else{
                res[odd]=nums[i];
                odd+=2;
            }
        }
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=res[i];
        // }
        return res;
    }
}