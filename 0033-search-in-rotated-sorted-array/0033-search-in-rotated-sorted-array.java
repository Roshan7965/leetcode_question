//method 02
class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if(nums[mid] == target) {
                return mid;
            } else if (nums[start] <= target && nums[mid] > target) {
                end = mid - 1;
            } else if (nums[start] > nums[mid] && (nums[start] <= target || nums[mid] > target)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return -1;
    }
}