class Solution {
    public String reverseWords(String s) {
        char [] chars=s.toCharArray();
        int start=0;
        int end=0;
        for(end=0;end<=chars.length;end++){
            if(end==chars.length || chars[end]==' '){
                reverse(chars,start,end-1);
                //rest the start for the next word
                start=end+1;
            }
        }
        return new String(chars);
    }
    
    private void reverse(char [] c,int start,int end){
        while(start<end){
            char temp=c[end];
            c[end]=c[start];
            c[start]=temp;
            start++;
            end--;
        }
    }
}