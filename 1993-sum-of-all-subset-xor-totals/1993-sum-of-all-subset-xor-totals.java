class Solution {
    public int subsetXORSum(int[] nums) {
    
        return subsetXOR(nums,0,0);
    }
    public int subsetXOR(int [] nums,int i,int sum){
        
        if(nums.length==i){
            return sum;
        }
        //yes
        int withElement= subsetXOR(nums,i+1,sum^nums[i]);
        //No
        int withOut=subsetXOR(nums,i+1,sum);
        return withOut+withElement;
        
    }
}