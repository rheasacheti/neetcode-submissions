class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        my_dict = {}
        for num in nums:
            if num in my_dict:
                my_dict[num] += 1
            else:
                my_dict[num] = 1

        max_heap = []

        for key, val in my_dict.items():
            heapq.heappush(max_heap, (-val, key))

        result = []

        for _ in range(k):
            frequency, key = heapq.heappop(max_heap)
            result.append(key)

        return result




