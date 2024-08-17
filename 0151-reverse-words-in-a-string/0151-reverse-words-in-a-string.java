class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        StringBuilder result=new StringBuilder();

        s=s.trim();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                sb.append(s.charAt(i));
            }else if(s.charAt(i+1)!=' '){
                result.insert(0,sb);
                sb.setLength(0);
                result.insert(0," ");
            }
            if(i==s.length()-1){
                result.insert(0,sb);
            }
        }
        return result.toString();
    }
}