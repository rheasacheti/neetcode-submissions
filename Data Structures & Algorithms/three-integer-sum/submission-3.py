class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        ans =[]
        nums.sort()
        for i in range(len(nums) - 2):
            start = i + 1
            end = len(nums) - 1
            while start < end:
                if nums[i] + nums[start] + nums[end] == 0:
                    if not [nums[i], nums[start], nums[end]] in ans:
                        ans.append([nums[i], nums[start], nums[end]])
                    start += 1
                    end -= 1
                else:
                    if nums[i] + nums[start] + nums[end] > 0:
                        end -= 1
                    else:
                        start += 1
        return ans

        