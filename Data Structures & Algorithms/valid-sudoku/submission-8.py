class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        for row in board:
            if not self.isValid(row):
                return False
        
        for i in range(len(board)):
            column = []
            for j in range(len(board[i])):
                column.append(board[j][i])
            if not self.isValid(column):
                return False

        for row_start in range(0, 9, 3):
            for column_start in range(0, 9, 3):
                box = []
                for i in range(3):
                    for j in range(3):
                        box.append(board[row_start + i][column_start +j])
                if not self.isValid(box):
                    return False
        
        return True
            
    def isValid(self, row):
        valid_nums = {"1","2","3","4","5","6","7","8","9"}
        for char in row:
            if char != ".":
                if char in valid_nums:
                    valid_nums.remove(char)
                else:
                    return False 
        return True

    

    







