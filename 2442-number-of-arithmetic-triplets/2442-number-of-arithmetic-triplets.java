class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        Set<Integer> seen =new HashSet<>();
        for(int num:nums){
            if(seen.contains(num-diff)&& seen.contains(num-diff*2)){
                ++count;
            }
            seen.add(num);
        }
        return count;
    }
}