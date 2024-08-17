class Solution {
    public int beautySum(String s) {
        int count=0;
        for(int i=0;i<s.length();++i){
            int []arr=new int[26];
            for(int j=i;j<s.length();++j){
                char ch=s.charAt(j);
                arr[ch-'a']++;
                int beauty=getMax(arr)-getMin(arr);
                count+=beauty;
            }
        }
        return count;
    }
    public int getMax(int []arr){
        int max=Integer.MIN_VALUE;
        for(int a:arr){
            max=Math.max(a,max);
        }
        return max;
    }
    public int getMin(int []arr){
        int min=Integer.MAX_VALUE;
        for(int a:arr){
            if(a!=0){
                min=Math.min(a,min);
            }
            
        }
        return min;
    }
}