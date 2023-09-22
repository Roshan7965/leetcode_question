class Solution {
    public boolean isSubsequence(String s, String t) {
        if((s!=null && t==null)||(s==null && t!=null) ||(s.length()>0 && t.length()==0) ){
            return false;
        }
        if((s.length()==0 && t.length()>0) || (s.length()==0 &&t.length()==0)){
            return true;
        }
        Stack<Character> stack1=new Stack();
        for(int i=0;i<s.length();i++) stack1.push(s.charAt(i));
        for(int i=t.length()-1;i>=0;i--){
            if(stack1.peek()==t.charAt(i)) stack1.pop();
            if(stack1.isEmpty()){
                return true;
            }
        }
        return false;
    }
}