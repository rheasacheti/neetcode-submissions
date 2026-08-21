class Solution {
    public int maxArea(int[] height) {
        // right - left = width 
        //min(height[left], height[right]) = height 
        int left = 0; 
        int right = height.length - 1;
        int max = (right - left) * (Math.min(height[left], height[right]));
        while(left < right) {
            int area = (right - left) * (Math.min(height[left], height[right]));
            if(max < area) {
                max = area;
            }
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
    //
}