class Solution {
    public int[] rearrangeArray(int[] nums) {
        int res[]=new int[nums.length];
        int k=1;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res[j]=nums[i];
                j=j+2;
            }else{
                res[k]=nums[i];
                k=k+2;
            }
        }
        return res;
    }
}