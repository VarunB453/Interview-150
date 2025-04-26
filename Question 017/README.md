# 12. Integer to Roman | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-12.%20Integer%20to%20Roman-blue)](https://leetcode.com/problems/integer-to-roman/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)]()

---

## 🧩 Problem Statement  

You are given an integer `num` between 1 and 3999.

Convert it to a Roman numeral according to the following rules:

| Symbol | Value |
|--------|--------|
| I | 1 |
| V | 5 |
| X | 10 |
| L | 50 |
| C | 100 |
| D | 500 |
| M | 1000 |

### Special cases (Subtractive notation):
- 4 → `IV` (5 - 1)  
- 9 → `IX` (10 - 1)  
- 40 → `XL` (50 - 10)  
- 90 → `XC` (100 - 10)  
- 400 → `CD` (500 - 100)  
- 900 → `CM` (1000 - 100)  

Roman numerals are written by combining symbols, from highest to lowest, subtracting when necessary.

---

## 🧠 Examples  

### Example 1  

| Input | Output |
|-------|--------|
| `num = 3749` | `"MMMDCCXLIX"` |

**Breakdown:**  
- `3000` = `MMM`  
- `700` = `DCC`  
- `40` = `XL`  
- `9` = `IX`

---

### Example 2  

| Input | Output |
|-------|--------|
| `num = 58` | `"LVIII"` |

**Breakdown:**  
- `50` = `L`  
- `8` = `VIII`

---

### Example 3  

| Input | Output |
|-------|--------|
| `num = 1994` | `"MCMXCIV"` |

**Breakdown:**  
- `1000` = `M`  
- `900` = `CM`  
- `90` = `XC`  
- `4` = `IV`

---

## ✅ Constraints  

- `1 <= num <= 3999`

---

## 💡 Approach  

We simulate the conversion by repeatedly subtracting the largest possible Roman numeral value and appending its symbol.

---

## 🔍 Complexity Analysis  

|                | Value |
|----------------|-------|
| **Time**       | `O(1)` — The loop runs a constant number of times (at most ~15 iterations) |
| **Space**      | `O(1)` — Only a few variables used |

---

## 🧪 Quick Test  

```java
public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.intToRoman(3749)); // MMMDCCXLIX
    System.out.println(sol.intToRoman(58));   // LVIII
    System.out.println(sol.intToRoman(1994)); // MCMXCIV
}
```

---

## ✨ Notes  

- The conversion leverages **greedy subtraction** and matches known patterns like `CM`, `XC`, etc.
- The problem is a classic example of **greedy algorithms** with precomputed rules.

---

## 📚 Topics & Hint  

**Topics:** Hash Table • Math • String  

**Hint:**  
> Use a table of symbol-to-value pairs and subtract the largest possible value at each step.

---
