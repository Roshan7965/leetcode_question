class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length/3;
        for(int i=0;i<nums.length;i++){
            int count=0;
            int element=nums[i];
            for(int j=0;j<nums.length;j++){
                if(element==nums[j]){
                    count++;
                }
            }
            if(count>n){
                if(!list.contains(element)){
                    list.add(element);
                }
            }
        }
        return list;
    }
}