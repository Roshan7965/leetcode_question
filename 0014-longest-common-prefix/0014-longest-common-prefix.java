class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res=strs[0];
        for(int i=1;i<strs.length;i++){
            res=commom(res,strs[i]);
        }
        return res;
    }
    public static String commom(String str1,String str2){
        int length=Math.min(str1.length(),str2.length());
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<length;i++){
            if(str1.charAt(i)==str2.charAt(i)){
                sb.append(str1.charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
    }
}