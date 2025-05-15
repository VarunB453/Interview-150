
# 36. Valid Sudoku | Java Solution

  


---

🧩 Problem Statement

Determine if a 9×9 Sudoku board is valid. Only the filled cells need to be validated according to these rules:

1. Each row must contain the digits 1–9 without repetition.


2. Each column must contain the digits 1–9 without repetition.


3. Each of the 9 3×3 sub-boxes must contain the digits 1–9 without repetition.



Empty cells are represented by the character '.'.


---

🧠 Examples

Example


---

✅ Constraints

The board is always a 9 x 9 grid.

Each cell is a digit '1'–'9' or '.'.



---

💡 Approach

✅ HashSet with Unique Keys

Use a single Set<String> to track seen digits.

For each digit, generate unique strings for:

Its row position (e.g. "5@row0")

Its column position (e.g. "5@col3")

Its 3x3 sub-box (e.g. "5@box00")


If any of these keys already exist in the set, the board is invalid.

If all entries are unique, the board is valid.

---

📚 Topics & Hint

Topics: Hashing, Matrix, Validation

Hint:

> Use a Set<String> and encode each position with row, column, and box labels to detect duplicates.

