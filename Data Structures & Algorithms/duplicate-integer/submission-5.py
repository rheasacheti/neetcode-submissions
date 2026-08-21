class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        duplicateCheck = set()
        for num in nums:
            if num in duplicateCheck:
                return True
            else:
                duplicateCheck.add(num)

        return False