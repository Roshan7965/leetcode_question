class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;
        for(int num:nums){
            if(0==num) zero++;
            if(1==num) one++;
            if(2==num) two++;
        }

        for(int i=0;i<zero;i++){
            nums[i]=0;
        }
        for(int i=zero;i<zero+one;i++){
            nums[i]=1;
        }
        for(int i=zero+one;i<zero+one+two;i++){
            nums[i]=2;
        }
    }
}