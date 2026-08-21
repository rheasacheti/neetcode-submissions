class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        values = set() # to hold the unique values in nums 
        for num in nums:
            if num not in values:
                values.add(num)
            else:
                return True
        return False
            

