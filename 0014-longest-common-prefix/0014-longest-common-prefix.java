class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
       
        String str1=strs[0];
        String str2=strs[strs.length-1];
        int len=Math.min(str1.length(),str2.length());
        String str3="";
        for(int i=0;i<len;i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                break;
            }else{
                str3+=str1.charAt(i);
            }
        }
        return str3;
    }
}