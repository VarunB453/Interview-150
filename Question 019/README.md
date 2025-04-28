# 58. Length of Last Word | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-58.%20Length%20of%20Last%20Word-blue)](https://leetcode.com/problems/length-of-last-word/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)]()

---

## 🧩 Problem Statement  

Given a string `s` consisting of words and spaces, return the **length of the last word** in the string.

- A **word** is a maximal substring consisting of non-space characters only.

---

## 🧠 Examples  

### Example 1  

| Input | Output |
|-------|--------|
| `s = "Hello World"` | `5` |

**Explanation:**  
The last word is `"World"` with a length of 5.

---

### Example 2  

| Input | Output |
|-------|--------|
| `s = "   fly me   to   the moon  "` | `4` |

**Explanation:**  
The last word is `"moon"` with a length of 4.

---

### Example 3  

| Input | Output |
|-------|--------|
| `s = "luffy is still joyboy"` | `6` |

**Explanation:**  
The last word is `"joyboy"` with a length of 6.

---

## ✅ Constraints  

- `1 <= s.length <= 10⁴`
- `s` consists only of English letters and spaces `' '`.
- There will be at least one word in `s`.

---

## 💡 Approach  

- Start from the **end of the string**.
- **Skip trailing spaces** if there are any.
- **Count** the characters of the last word until you reach another space or the beginning of the string.

---

## 🔍 Complexity Analysis  

|                | Value |
|----------------|-------|
| **Time**       | `O(n)` — where `n` is the length of the string |
| **Space**      | `O(1)` — constant extra space |

---

## 🧪 Quick Test  

```java
public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.lengthOfLastWord("Hello World"));           // 5
    System.out.println(sol.lengthOfLastWord("   fly me   to   the moon  ")); // 4
    System.out.println(sol.lengthOfLastWord("luffy is still joyboy")); // 6
}
```

---

## ✨ Notes  

- **Skipping trailing spaces** is important to correctly find the last word.
- Efficient single-pass solution — no need to split the string into an array.

---

## 📚 Topics & Hint  

**Topics:** String • Two Pointers  

**Hint:**  
> Traverse the string from the end, skip spaces, and then count the length of the last word.
---
