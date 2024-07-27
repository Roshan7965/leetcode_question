class Solution {
    public int longestConsecutive(int[] a) {
       int n = a.length;
        if (n == 0) return 0;

       
        Arrays.sort(a);
        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;

        
        for (int i = 0; i < n; i++) {
            if (a[i] - 1 == lastSmaller) {
                
                cnt += 1;
                lastSmaller = a[i];
            } else if (a[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = a[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }

   
}