class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        open_parentheses = {'(', '{', '['}
        for char in s:
            if char in open_parentheses:
                stack.append(char)
            if char == ')':
                if len(stack) == 0 or not stack.pop() == '(':
                    return False 
            if char == '}':
                if len(stack) == 0 or not stack.pop() == '{':
                    return False 
            if char == ']':
                if len(stack) == 0 or not stack.pop() == '[':
                    return False 
        if len(stack) == 0:
            return True 
        return False