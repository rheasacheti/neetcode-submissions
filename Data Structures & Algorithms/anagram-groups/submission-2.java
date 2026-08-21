class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //anagram -> words with the exact same letter config
        //maybe make a method to check for anagrams
        //to check for anagrams we can use arrays of 26 letters each
        //make a hashmap where the key is and int array of length 26 and the value is a list of words that are anagrams
        Map<String, List<String>> hm = new HashMap<>();
        for(String s: strs) {
            int[] letters = new int[26];
            for(int i = 0; i < s.length(); i++) {
                letters[s.charAt(i) - 'a']++;
            }
            String st = Arrays.toString(letters);
            if(hm.containsKey(st)) {
                hm.get(st).add(s);
            } else {
                List string = new ArrayList<>();
                string.add(s);
                hm.put(st,string);
            }
         }

         return new ArrayList<>(hm.values());

    }
}
