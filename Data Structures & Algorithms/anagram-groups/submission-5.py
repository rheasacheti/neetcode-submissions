# class Solution:
#     def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
#         ## array with 26 values where each index correspods to that letter in order 
#         ## dict with key -> array , value -> list of words 
#         #iterate through dict keys and add all values to the list of lists 
#         # return list 
#         values = {}
#         for s in strs:
#             count = [0] * 26
#             for c in s:
#                 count[ord(c) - ord('a')] += 1
#             key = tuple(count)
#             if key not in values:
#                 values[key] = []
#             values[key].append(s)
#         result = []
#         for key in values:
#             result.append(values[key])
#         return result

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        n= len(strs)
        groups = defaultdict(list)

        for words in strs:
            key = "".join(sorted(words))
            groups[key].append(words)
        
        return list(groups.values())

            
