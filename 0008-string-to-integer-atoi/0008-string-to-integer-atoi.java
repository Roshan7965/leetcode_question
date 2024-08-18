class Solution {
    public int myAtoi(String s) {
        s = s.trim();  
        if (s.isEmpty()) return 0;  
        
        StringBuilder sb = new StringBuilder();
        int i = 0;
        long count = 0;  
        boolean flag = true;
        
       
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            flag = false;
            i++;
        }
        
        
        while (i < s.length()) {
            char ch = s.charAt(i);
            
            if (Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');
                
                
                if (flag && count > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                } else if (!flag && -count < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
                
            } else {
                break;  
            }
            i++;
        }
        
        return flag ? (int) count : (int) -count;
    }
}
