class Solution {
    public long minimumPossibleSum(int n, int target) {
        HashSet<Integer> set=new HashSet<>();
        int number=1;
        int index=0;
        long sum=0;
        while(index<n){
            if(!set.contains(number)){
                set.add(number);
                if(target-number>0) set.add(target-number);
                index++;
                sum+=number;
            }
            number++;
        }
        return sum;
    }
}