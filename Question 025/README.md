# 125. Valid Palindrome | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-125.%20Valid%20Palindrome-blue)](https://leetcode.com/problems/valid-palindrome/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)]()

---

## 🧩 Problem Statement

A **palindrome** is a string that reads the same forward and backward after:

- Converting all uppercase letters to lowercase
- Removing all non-alphanumeric characters (punctuation, spaces, etc.)

Given a string `s`, return `true` if it is a **valid palindrome**, and `false` otherwise.

---

## 🧠 Examples

### Example 1

| Input | Output |
|-------|--------|
| `"A man, a plan, a canal: Panama"` | `true` |

📝 Explanation: After cleaning, the string becomes `"amanaplanacanalpanama"`, which is a palindrome.

---

### Example 2

| Input | Output |
|-------|--------|
| `"race a car"` | `false` |

📝 Explanation: After cleaning, `"raceacar"` is not the same forwards and backwards.

---

### Example 3

| Input | Output |
|-------|--------|
| `" "` | `true` |

📝 Explanation: Empty strings are considered palindromes.

---

## ✅ Constraints

- `1 <= s.length <= 2 * 10⁵`
- `s` consists only of printable ASCII characters

---

## 💡 Approach

### 🔹 Two-Pointer Technique

1. Convert the string to lowercase.
2. Use two pointers (`left` and `right`) to traverse from both ends.
3. Skip non-alphanumeric characters.
4. Compare characters at both pointers:
   - If they differ, return `false`
   - If they match, move pointers closer
5. If all characters matched, return `true`

---

## 🔄 Complexity Analysis

|                | Value         |
|----------------|---------------|
| **Time**       | `O(n)`        |
| **Space**      | `O(1)`        |

---

## 📚 Topics & Hint

**Topics:** String • Two Pointers

**Hint:**  
> Clean the string while scanning by ignoring non-alphanumeric characters and comparing characters from both ends.

---
