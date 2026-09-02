class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        longest = 1
        set_nums = set(nums)
        for num in nums:
            if num - 1 in set_nums:
                continue
            else:
                sum = 1
                next_num = num + 1
                while next_num in set_nums:
                    sum = sum + 1
                    if longest < sum:
                        longest = sum
                    next_num = next_num + 1
        return longest



        

