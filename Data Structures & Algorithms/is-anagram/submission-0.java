class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (m == n) {
            int[] arr_s = new int[26];
            int[] arr_t = new int[26];
            for(int i = 0; i < m; i++) {
                arr_s[((int)s.charAt(i) - 97)]++;
                arr_t[((int)t.charAt(i) - 97)]++;
            }
            for(int i = 0; i < 26; i++) {
                if (arr_s[i] != arr_t[i]) {
                    return false;
                }
            }
            return true;
        }
        return false; 
    }
}
