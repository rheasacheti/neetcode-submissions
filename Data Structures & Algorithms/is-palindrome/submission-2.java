class Solution {
    public boolean isPalindrome(String s) {
        
       s = s.toLowerCase();
        int start = 0; 
        int end = s.length() - 1;
        // System.out.println(alphanum);
        while(start < end) {
            
            if (!((s.charAt(start) >=  97 && s.charAt(start) < 123) || (s.charAt(start) >=  48 && s.charAt(start) <= 57))) {
                start++;
                continue;
            }
            if (!((s.charAt(end) >=  97 && s.charAt(end) < 123) || (s.charAt(end) >=  48 && s.charAt(end) <= 57))) {
                end--;
                continue;
            }
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
        
    }
}
