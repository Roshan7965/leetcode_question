class Solution {
    public String longestPalindrome(String s) {
        for(int i=s.length();i>0;i--){
            for(int j=0;j<=s.length()-i;j++){
                if(check(j,j+i,s)){
                    return s.substring(j,j+i);
                }
            }
        }
        return " ";
    }

    public boolean check(int i,int j,String s){
        int low=i;
        int high=j-1;
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
  
}