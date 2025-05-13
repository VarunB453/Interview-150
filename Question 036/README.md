# 48. Rotate Image

  


---

🧩 Problem Statement

You are given an n x n 2D matrix representing an image, rotate the image in-place by 90 degrees (clockwise).

You must modify the input matrix directly. Do not allocate another 2D matrix to perform the rotation.


---

🧠 Examples

Example 1


---

Example 2


---

✅ Constraints

n == matrix.length == matrix[i].length

1 <= n <= 20

-1000 <= matrix[i][j] <= 1000



---

💡 Approach

🔄 Reverse + Transpose (In-Place)

To rotate the matrix 90 degrees clockwise:

1. Reverse the rows (top to bottom).


2. Transpose the matrix (swap matrix[i][j] with matrix[j][i] for i < j).



This effectively rotates the matrix without using extra space.


---

🔍 Complexity Analysis


---

🧪 Quick Test

public static void main(String[] args) {
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    new Solution().rotate(matrix);
    System.out.println(Arrays.deepToString(matrix)); // [[7,4,1],[8,5,2],[9,6,3]]
}


---

🧠 Code

class Solution {
  public void rotate(int[][] matrix) {
    // Step 1: Reverse the matrix rows
    for (int i = 0, j = matrix.length - 1; i < j; ++i, --j) {
      int[] temp = matrix[i];
      matrix[i] = matrix[j];
      matrix[j] = temp;
    }

    // Step 2: Transpose the matrix
    for (int i = 0; i < matrix.length; ++i)
      for (int j = i + 1; j < matrix.length; ++j) {
        final int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
  }
}


---

📚 Topics

Topics: Array • Matrix • In-Place Algorithms


---

💡 Hints

1. First reverse the matrix vertically.


2. Then take the transpose by swapping symmetric elements across the diagonal.


3. In-place tricks help avoid extra memory usage.


