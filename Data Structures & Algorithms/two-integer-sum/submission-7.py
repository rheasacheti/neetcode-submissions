class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        if len(nums) > 0:
            values = {}
            count = 0
            ## key -> target - curr num : check for num in dict 
            ## value -> index of curr num
            for num in nums:
                if len(values) <= 0:
                    values[target - num] = count
                    count += 1
                else:
                    if num in values:
                        return [values[num], count]
                    else:
                        values[target - num] = count
                        count += 1

        return [-1, -1]