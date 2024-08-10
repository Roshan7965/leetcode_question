class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> bracket=new Stack<>();
        StringBuilder sb=new StringBuilder("");
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(bracket.size()>0){
                    sb.append(ch);
                }
                bracket.push(ch);
            }else{
                bracket.pop();
                if(bracket.size()>0){
                    sb.append(ch);
                }
            }
        }
       return  sb.toString();
    }
}