class Solution {
    public boolean isPalindrome(int x) {
        int r,sum=0,temp;
        temp=x;
        while(x>0){
            r=x%10;
            sum=sum*10+r;
            x/=10;

        }
        if(sum==temp){
            return true;
        }else{
            return false;
        }
    }
}