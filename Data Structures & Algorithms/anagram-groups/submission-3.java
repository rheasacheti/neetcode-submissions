class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            int[] chars_arr = new int[26];
            for(int j = 0; j < strs[i].length(); j++) {
                chars_arr[strs[i].charAt(j) - 'a']++;
            }
            String str_arr = Arrays.toString(chars_arr);
            if(hm.containsKey(str_arr)) {
                hm.get(str_arr).add(strs[i]);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                hm.put(str_arr, temp);
            }
        }
        return new ArrayList<>(hm.values());
    }
}
