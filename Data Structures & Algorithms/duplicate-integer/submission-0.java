class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length >= 1){
            Set<Integer> hs = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if(hs.contains(nums[i])) {
                    return true;
                } else {
                    hs.add(nums[i]);
                }
            }
        } 
        return false;
    }
}
