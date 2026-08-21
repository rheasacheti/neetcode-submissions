class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        boolean change = false;
        while(left < right) {
            char start = s.charAt(left);
            char end = s.charAt(right);
            change = false;
            if(!Character.isLetterOrDigit(start)) {
                left++;
                change = true;
            } 
            if(!Character.isLetterOrDigit(end)) {
                right--;
                change = true;
            }
            if(!change) {
                if(start != end) {
                    return false;
                } else {
                    left++;
                    right--;
                }
            }
        }
        return true;
    }
}
