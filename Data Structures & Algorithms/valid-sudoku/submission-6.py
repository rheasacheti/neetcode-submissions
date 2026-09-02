class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        for row in board:
            if not self.isValidRow(row):
                return False
        
        for i in range(len(board)):
            column = []
            for j in range(len(board[i])):
                column.append(board[j][i])
            if not self.isValidColumn(column):
                return False

        # [0,0], [0, 1], [0,2] [0,3], [0, 4], [0,5]
        # [1,0], [1, 1], [1,2] [1,3], [1, 4], [1,5]
        # [2,0], [2, 1], [2,2] [2,3], [2, 4], [2,5]
        # [3,0], [3, 1], [3,2] [3,3], [3, 4], [3,5]
        # [4,0], [4, 1], [4,2] [4,3], [4, 4], [4,5]
        # [5,0], [5, 1], [5,2] [5,3], [5, 4], [5,5]


        for row_start in range(0, 9, 3):
            for column_start in range(0, 9, 3):
                box = []
                for i in range(3):
                    for j in range(3):
                        box.append(board[row_start + i][column_start +j])
                if not self.isValidBox(box):
                    return False
        
        return True
            
    def isValidRow(self, row):
        valid_nums = {"1","2","3","4","5","6","7","8","9"}
        for char in row:
            if char != ".":
                if char in valid_nums:
                    valid_nums.remove(char)
                else:
                    return False 
        return True

    def isValidColumn(self, column):
        valid_nums = {"1","2","3","4","5","6","7","8","9"}
        for char in column:
            if char != ".":
                if char in valid_nums:
                    valid_nums.remove(char)
                else:
                    return False 
        return True

    def isValidBox(self, box):
        valid_nums = {"1","2","3","4","5","6","7","8","9"}
        for char in box:
            if char != ".":
                if char in valid_nums:
                    valid_nums.remove(char)
                else:
                    return False 
        return True







