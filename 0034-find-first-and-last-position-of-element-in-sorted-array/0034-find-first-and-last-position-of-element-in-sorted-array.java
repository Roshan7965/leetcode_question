class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int first=firstOccuraces(nums,target);
        if(first==-1) return new int[]{-1,-1};
        int second=secondOccuraces(nums,target);
        return new int[]{first,second};
    }

    public int firstOccuraces(int nums[],int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int first=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return first;
    }

    public int secondOccuraces(int nums[],int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int second=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                second=mid;
                low=mid+1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return second;
    }
}