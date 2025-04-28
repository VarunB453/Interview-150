# 13. Roman to Integer | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-13.%20Roman%20to%20Integer-blue)](https://leetcode.com/problems/roman-to-integer/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)]()

---

## 🧩 Problem Statement  

Roman numerals are represented by seven different symbols:

| Symbol | Value |
|--------|-------|
| I | 1 |
| V | 5 |
| X | 10 |
| L | 50 |
| C | 100 |
| D | 500 |
| M | 1000 |

### Special Subtractive Cases:
- `IV` = 4  
- `IX` = 9  
- `XL` = 40  
- `XC` = 90  
- `CD` = 400  
- `CM` = 900  

Roman numerals are usually written from largest to smallest left to right, but for the cases above, a smaller numeral before a larger numeral means **subtraction**.

Given a roman numeral string `s`, convert it to an integer.

---

## 🧠 Examples  

### Example 1  

| Input | Output |
|-------|--------|
| `s = "III"` | `3` |

**Explanation:** `III = 1 + 1 + 1 = 3`

---

### Example 2  

| Input | Output |
|-------|--------|
| `s = "LVIII"` | `58` |

**Explanation:**  
- `L` = 50  
- `V` = 5  
- `III` = 3  
Total = `50 + 5 + 3 = 58`

---

### Example 3  

| Input | Output |
|-------|--------|
| `s = "MCMXCIV"` | `1994` |

**Explanation:**  
- `M` = 1000  
- `CM` = 900  
- `XC` = 90  
- `IV` = 4  
Total = `1000 + 900 + 90 + 4 = 1994`

---

## ✅ Constraints  

- `1 <= s.length <= 15`
- `s` contains only characters: `('I', 'V', 'X', 'L', 'C', 'D', 'M')`
- `s` is guaranteed to be a valid Roman numeral between 1 and 3999.

---

## 💡 Approach  

- Create a **map** of Roman numeral symbols to their integer values.
- Loop through the string:
  - If the current symbol's value is **less** than the next symbol's value, **subtract** it.
  - Otherwise, **add** it.

---

## 🔍 Complexity Analysis  

|                | Value |
|----------------|-------|
| **Time**       | `O(n)` — where `n` is the length of the string |
| **Space**      | `O(1)` — only a fixed-size map and a few variables |

---

## 🧪 Quick Test  

```java
public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.romanToInt("III"));     // 3
    System.out.println(sol.romanToInt("LVIII"));   // 58
    System.out.println(sol.romanToInt("MCMXCIV")); // 1994
}
```

---

## ✨ Notes  

- The key is identifying **when to subtract** instead of adding.
- Whenever a smaller numeral comes **before** a larger one, subtract its value.
- This solution leverages a **greedy** approach.

---

## 📚 Topics & Hint  

**Topics:** Hash Table • Math • String  

**Hint:**  
> Compare current and next values. If current < next, subtract current; else, add it.

---
