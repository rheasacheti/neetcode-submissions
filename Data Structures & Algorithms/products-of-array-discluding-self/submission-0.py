class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        num_zeroes = 0
        total_product = 1
        for num in nums:
            if num != 0:
                total_product = total_product * num 
            else:
                num_zeroes = num_zeroes + 1

        output = []
        for i in range(len(nums)):
            if num_zeroes > 0:
                if nums[i] == 0 and num_zeroes == 1:
                    output.append(total_product)
                else:
                    output.append(0)
            else:
                output.append(total_product // nums[i])

        return output 