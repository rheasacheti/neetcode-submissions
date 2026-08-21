class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
        String alphanum = "";
        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i) >=  97 && s.charAt(i) < 123) || (s.charAt(i) >=  48 && s.charAt(i) < 57)) {
                alphanum += s.charAt(i);
            }
        }
        int start = 0; 
        int end = alphanum.length() - 1;
        while(start < end) {
            
            if (alphanum.charAt(start) != alphanum.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
        
    }
}
