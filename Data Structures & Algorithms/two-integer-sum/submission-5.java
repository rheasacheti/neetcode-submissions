class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        map.put(target - nums[0], 0);
        for(int i = 1; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                ans[0] = map.get(nums[i]);
                ans[1] = i;
                return ans;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return new int[] {-1, -1};
    }
}
