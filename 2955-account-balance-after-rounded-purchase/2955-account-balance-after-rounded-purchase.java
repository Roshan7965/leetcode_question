class Solution {
    public int accountBalanceAfterPurchase(int amt) {
        int temp=amt;
        int count1=0;
        while(temp%10!=0){
            count1++;
            temp-=1;
        }
        temp=amt;
        int count2=0;
        while(temp%10!=0){
            count2++;
            temp+=1;
        }
        return count1<count2?100-(amt-count1):100-(amt+count2);
    }
}