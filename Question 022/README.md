# 6. Zigzag Conversion | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-6.%20Zigzag%20Conversion-blue)](https://leetcode.com/problems/zigzag-conversion/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)]()

---

## 🧩 Problem Statement  

The string `"PAYPALISHIRING"` is written in a zigzag pattern on a given number of rows like this:

```
P   A   H   N
A P L S I I G
Y   I   R
```

And then read line by line: `"PAHNAPLSIIGYIR"`.

---

You are asked to implement:

```java
String convert(String s, int numRows)
```

that performs this zigzag conversion.

---

## 🧠 Examples  

### Example 1  

| Input | Output |
|-------|--------|
| `s = "PAYPALISHIRING", numRows = 3` | `"PAHNAPLSIIGYIR"` |

---

### Example 2  

| Input | Output |
|-------|--------|
| `s = "PAYPALISHIRING", numRows = 4` | `"PINALSIGYAHRPI"` |

**Zigzag Pattern:**
```
P     I    N
A   L S  I G
Y A   H R
P     I
```

---

### Example 3  

| Input | Output |
|-------|--------|
| `s = "A", numRows = 1` | `"A"` |

---

## ✅ Constraints  

- `1 <= s.length <= 1000`
- `s` consists of English letters (upper-case and lower-case), `','` and `'.'`.
- `1 <= numRows <= 1000`

---

## 💡 Approach  

- If `numRows == 1`, just return the original string.
- Otherwise, we create an array of StringBuilder, each representing a row.
- Traverse the input string, appending characters to the correct row.
- Move **down** the rows until the bottom is reached, then **up** until the top is reached (zigzag pattern).

---

## 🔍 Complexity Analysis  

|                | Value |
|----------------|-------|
| **Time**       | `O(n)` — where `n` is the length of the string |
| **Space**      | `O(n)` — for storing all characters in the zigzag pattern |

---

## 🧪 Quick Test  

```java
public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.convert("PAYPALISHIRING", 3)); // PAHNAPLSIIGYIR
    System.out.println(sol.convert("PAYPALISHIRING", 4)); // PINALSIGYAHRPI
    System.out.println(sol.convert("A", 1));              // A
}
```

---

## ✨ Notes  

- The key part is handling the **change of direction** (down then up).
- When there is only 1 row, there is **no zigzag**, just return the original string.

---

## 📚 Topics & Hint  

**Topics:** String • Simulation  

**Hint:**  
> Simulate the zigzag traversal by moving vertically and diagonally through the rows.

---