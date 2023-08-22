class Solution {
    public String convertToTitle(int colN) {
        StringBuilder sc=new StringBuilder();

        while(colN>0){
            colN--;
            int rem=colN%26;

            sc.append((char)('A'+rem));
            colN/=26;
        }
        return sc.reverse().toString();
    }
}