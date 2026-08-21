class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        hm.put(target - nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if(hm.containsKey(nums[i])) {
                return new int[]{hm.get(nums[i]), i};
            } else {
                hm.put(target - nums[i], i);
            }
        }
        return new int[]{-1,-1};
    }
}
