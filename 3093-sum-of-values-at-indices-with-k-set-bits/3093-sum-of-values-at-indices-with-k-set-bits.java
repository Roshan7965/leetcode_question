class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            int index=i;
            int setBit=0;
            while(index>0){
               setBit+=index&1;
               index>>=1;
            }
            if(setBit==k){
                sum+=nums.get(i);
            }

        }
        return sum;
        
    }
}