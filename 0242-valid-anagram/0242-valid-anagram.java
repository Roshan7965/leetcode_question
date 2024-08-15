class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int ch1[]=new int[26];
        int ch2[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char ch3=t.charAt(i);
           ch1[ch-97]++;
           ch2[ch3-97]++;
        }
        for(int i=0;i<26;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
        return true;
    }
}