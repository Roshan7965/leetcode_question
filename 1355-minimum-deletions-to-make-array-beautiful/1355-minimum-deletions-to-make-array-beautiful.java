class Solution {
    public int minDeletion(int[] nums) {
        boolean even= true;
        int size=0,c=0;
        for(int i=0;i<nums.length;i++){
            //current index is even and i+1 is same
            while(i+1<nums.length && even&& nums[i]==nums[i+1]){
                i++;
                c++;
            }
            //change index parity
            even=!even;
            size++;
        }
        return c+size%2;
    }
}