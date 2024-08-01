class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
     
        int e1=Integer.MIN_VALUE;
        int e2=Integer.MIN_VALUE;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<n;i++){
            if(cnt1==0 && e2!=nums[i]){
                cnt1=1;
                e1=nums[i];
            }else if(cnt2==0 && e1!=nums[i]){
                cnt2=1;
                e2=nums[i];
            }else if(e1==nums[i]){
                cnt1++;
            }else if(e2==nums[i]){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int num:nums){
            if(num==e1){
                cnt1++;
            }else if(num==e2){
                cnt2++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        if(cnt1*3 > n) ans.add(e1);
        if(cnt2*3 > n) ans.add(e2);
        return ans;

    }
}