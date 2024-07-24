class Solution {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(int num:nums){
            res.add(num);
        }
        for(int i=0;i<=nums.length;i++){
            if(!res.contains(i)){
                return i;
            }
        }
        return -1;
    }
}