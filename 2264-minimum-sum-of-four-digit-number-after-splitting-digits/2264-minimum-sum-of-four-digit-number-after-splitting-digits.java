class Solution {
    public int minimumSum(int num) {
        int [] number=new int[4];
        int cur=0;
        while(num>0){
            number[cur]=num%10;
            num/=10;
            cur++;
        }
        Arrays.sort(number);
        return (number[0]*10+number[3])+(number[1]*10+number[2]);
    }
}