class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int [] res=new int[nums.length];
        int s=0,e=nums.length-1;
        for(int num :nums){
            if(num%2==0){
                res[s]=num;
                s++;
            }else{
                res[e]=num;
                e--;
            }
        }
        return res;
    }
}