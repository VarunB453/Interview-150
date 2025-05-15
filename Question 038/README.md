# 289 - Game of Life

Problem Description

Conway's Game of Life is a cellular automaton where each cell on a 2D board has two possible states: alive (1) or dead (0). The next state of each cell is determined by its current state and the number of live neighbors, based on these rules:

1. Underpopulation: A live cell with fewer than two live neighbors dies.


2. Survival: A live cell with two or three live neighbors lives.


3. Overpopulation: A live cell with more than three live neighbors dies.


4. Reproduction: A dead cell with exactly three live neighbors becomes alive.



The update must be done in-place, i.e., without using extra memory for a copy of the board.

LeetCode Link: https://leetcode.com/problems/game-of-life/


---

Java Bitwise Solution

This solution encodes both the current and next state in the same cell using bit manipulation:

Current state: stored in the least significant bit (board[i][j] & 1)

Next state: stored in the 2nd least significant bit (board[i][j] |= 0b10)


After computing the next state for all cells, we right-shift each cell to apply the update.

class Solution {
  public void gameOfLife(int[][] board) {
    final int m = board.length;
    final int n = board[0].length;

    for (int i = 0; i < m; ++i)
      for (int j = 0; j < n; ++j) {
        int ones = 0;
        for (int x = Math.max(0, i - 1); x < Math.min(m, i + 2); ++x)
          for (int y = Math.max(0, j - 1); y < Math.min(n, j + 2); ++y)
            ones += board[x][y] & 1;
        // Rule 2: Survival
        if (board[i][j] == 1 && (ones == 3 || ones == 4))
          board[i][j] |= 0b10;
        // Rule 4: Reproduction
        if (board[i][j] == 0 && ones == 3)
          board[i][j] |= 0b10;
      }

    // Final update: shift right to apply next state
    for (int i = 0; i < m; ++i)
      for (int j = 0; j < n; ++j)
        board[i][j] >>= 1;
  }
}


---

Explanation

We use board[x][y] & 1 to get the current state (either 0 or 1).

ones counts the total number of live cells in the neighborhood, including the current cell, so for a live cell, ones == 3 or 4 means 2 or 3 live neighbors.

We set the next state by updating the 2nd bit if the cell should be alive in the next generation.

Finally, we right-shift all cells (>>= 1) to apply the update.



---

Time and Space Complexity

Time Complexity: O(m * n)

Space Complexity: O(1) (in-place with bit manipulation)



