class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int res[]=new int[nums1.length+nums2.length];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            res[k]=nums1[i];
            k++;
        }
        for(int i=0;i<nums2.length;i++){
            res[k]=nums2[i];
            k++;
        }
        Arrays.sort(res);
        double median=0;
        int mid=(0+res.length)/2;
        if(res.length%2==0){
            double ans=(res[mid]+res[mid-1]);
            median=ans/2;
        }else{
            median=res[mid];
        }
        return median;
    }
}