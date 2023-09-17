class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            int index=i;
            int setBits=0;

            //Count the number of set bits int he binary represntation of the index;
            while(index>0){
                setBits += index & 1;
                index>>=1;

            }
            //check if the count of set bits matches matches k
            if(setBits==k){
                sum+=nums.get(i);

            }

        }
        return sum;
    }
}