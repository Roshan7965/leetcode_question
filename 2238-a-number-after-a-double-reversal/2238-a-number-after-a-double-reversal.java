class Solution {
    public boolean isSameAfterReversals(int num) {
        int m=num;
        int sum=0;
        while(num!=0){
            sum=sum*10+num%10;
            num/=10;
        }
        int sum1=0;
        while(sum!=0){
            sum1=sum1*10+sum%10;
            sum/=10;
        }
        if(sum1==m){
            return true;
        }
        return false;
    }
}