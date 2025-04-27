# 151. Reverse Words in a String | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-151.%20Reverse%20Words%20in%20a%20String-blue)](https://leetcode.com/problems/reverse-words-in-a-string/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)]()

---

## 🧩 Problem Statement  

Given an input string `s`, reverse the order of the words.

- A word is defined as a sequence of non-space characters.
- The words in `s` will be separated by at least one space.
- Return a string of the words in reverse order concatenated by a single space.
- The returned string should not contain leading or trailing spaces.
- Multiple spaces between two words should be reduced to a single space.

---

## 🧠 Examples  

### Example 1  

| Input | Output |
|-------|--------|
| `s = "the sky is blue"` | `"blue is sky the"` |

---

### Example 2  

| Input | Output |
|-------|--------|
| `s = "  hello world  "` | `"world hello"` |

---

### Example 3  

| Input | Output |
|-------|--------|
| `s = "a good   example"` | `"example good a"` |

---

## ✅ Constraints  

- `1 <= s.length <= 10^4`
- `s` contains English letters (upper-case and lower-case), digits, and spaces `' '`.
- There is at least one word in `s`.

---

## 💡 Approach  

### 🔄 Two Pointer Approach  

1. Start from the end of the string.
2. Skip trailing spaces.
3. Identify each word and append it to the result.
4. Add a space after each word except the last.
5. Finally, trim any extra spaces.

---

## 🔍 Complexity Analysis  

|                | Value |
|----------------|-------|
| **Time**       | `O(n)` — where `n` is the length of the string |
| **Space**      | `O(n)` — to store the result |

---

## ✨ Possible Improvements  

- **In-place** solution with `O(1)` extra space if the string is mutable (e.g., in languages like C++).

---

## 📚 Topics & Hint  

**Topics:** String • Two Pointers  

**Hint:**  
> Trim spaces, reverse the entire string, then reverse each word individually.

---