class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = [set() for _ in range(9)]
        columns = [set() for _ in range(9)]
        boxes =  [set() for _ in range(9)]

        for r in range(9):
            for c in range(9):
                
                if board[r][c] == '.':
                    continue
                b = (r // 3) + (c // 3) * 3
                if board[r][c] in rows[r] or board[r][c] in columns[c] or board[r][c] in boxes[b]:
                    return False
                else:
                    rows[r].add(board[r][c])
                    columns[c].add(board[r][c])
                    boxes[b].add(board[r][c])
        return True
                    


