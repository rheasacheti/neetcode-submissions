class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] st_chars =new int[26];

        for(int i = 0; i < s.length(); i++) {
            st_chars[s.charAt(i) - 'a']++;
            st_chars[t.charAt(i) - 'a']--;
        }

        for(int i =0; i < 26; i++) {
            if(st_chars[i] != 0) {
                return false;
            }
        }
        return true;


    }
}
