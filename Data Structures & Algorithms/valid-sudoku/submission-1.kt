class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val boardColumns = rowsToColumns(board)
        val sections = rowsToSections(board)
        val rowsValid = board.map(::isValidSequence).reduce { b1, b2 -> b1 && b2 }
        val columnsValid = boardColumns.map(::isValidSequence).reduce { b1, b2 -> b1 && b2 }
        val sectionsValid = sections.map(::isValidSequence).reduce { b1, b2 -> b1 && b2 }
        return rowsValid && columnsValid && sectionsValid
    }

    fun isValidSequence(sequence: CharArray): Boolean {
        val filtered = sequence.filter { c -> c != '.' }
        return filtered.distinct().size == filtered.size
    }

    fun rowsToColumns(board: Array<CharArray>): Array<CharArray> {
        return board.mapIndexed { i, _ ->
            board.map { row ->
                row[i]
            }.toCharArray()
        }.toTypedArray()
    }

    fun rowsToSections(board: Array<CharArray>): Array<CharArray> {
        val leftRange = 0..2
        val middleRange = 3..5
        val rightRange = 6..8
        val topLeft = (board[0].slice(leftRange) + board[1].slice(leftRange) + board[2].slice(leftRange)).toCharArray()
        val topMiddle = (board[0].slice(middleRange) + board[1].slice(middleRange) + board[2].slice(middleRange)).toCharArray()
        val topRight = (board[0].slice(rightRange) + board[1].slice(rightRange) + board[2].slice(rightRange)).toCharArray()
        val middleLeft = (board[3].slice(leftRange) + board[4].slice(leftRange) + board[5].slice(leftRange)).toCharArray()
        val middleMiddle = (board[3].slice(middleRange) + board[4].slice(middleRange) + board[5].slice(middleRange)).toCharArray()
        val middleRight = (board[3].slice(rightRange) + board[4].slice(rightRange) + board[5].slice(rightRange)).toCharArray()
        val bottomLeft = (board[6].slice(leftRange) + board[7].slice(leftRange) + board[8].slice(leftRange)).toCharArray()
        val bottomMiddle = (board[6].slice(middleRange) + board[7].slice(middleRange) + board[8].slice(middleRange)).toCharArray()
        val bottomRight = (board[6].slice(rightRange) + board[7].slice(rightRange) + board[8].slice(rightRange)).toCharArray()

        return arrayOf(topLeft, topMiddle, topRight, middleLeft, middleMiddle, middleRight, bottomLeft, bottomMiddle, bottomRight)
    }
}
