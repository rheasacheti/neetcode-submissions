class Solution:
    def maxArea(self, heights: List[int]) -> int:
        
        start = 0
        end = len(heights) - 1
        width = end - start
        max_area = 0
        while start < end:
            width = end - start
            area  = min(heights[end], heights[start]) * width
            if area > max_area:
                max_area = area
            if heights[end] > heights[start]:
                start = start + 1
            else:
                end = end - 1
        return max_area