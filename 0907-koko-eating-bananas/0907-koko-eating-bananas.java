class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;

        int low=1;
        int high=Max_element(piles,n);

        while(low<high){
            int mid=low+(high-low)/2;
            
            if(canEatAll(piles,mid,h)){
                high=mid;
            }else{
                low=mid+1;
            }

        }
        return low;
    }

    private boolean canEatAll(int [] piles,int mid,int h){
        int calHour=0;

        for(int x:piles){
            calHour+=x/mid;
            if(x%mid!=0){
                calHour++;
            }
        }
        return calHour<=h;
    }

    private int Max_element(int []piles,int n){
        int ans=Integer.MIN_VALUE;
       for(int num:piles){
           if(ans<num){
            ans=num;
           }
       }
        return ans;
    }
}
