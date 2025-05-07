# 3. Longest Substring Without Repeating Characters | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-3.%20Longest%20Substring%20Without%20Repeating%20Characters-blue)](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
[![Language](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)]()

---

## 🧩 Problem Statement

Given a string `s`, find the **length of the longest substring** without repeating characters.

---

## 🧠 Examples

### Example 1

| Input        | Output | Explanation            |
| ------------ | ------ | ---------------------- |
| `"abcabcbb"` | `3`    | `"abc"` is the longest |

### Example 2

| Input     | Output | Explanation          |
| --------- | ------ | -------------------- |
| `"bbbbb"` | `1`    | `"b"` is the longest |

### Example 3

| Input      | Output | Explanation            |
| ---------- | ------ | ---------------------- |
| `"pwwkew"` | `3`    | `"wke"` is the longest |

---

## ✅ Constraints

* `0 <= s.length <= 5 * 10⁴`
* `s` consists of English letters, digits, symbols and spaces.

---

## 💡 Approach

### Sliding Window (Efficient)

Use two pointers to maintain a window of non-repeating characters.

**Steps:**

1. Use a `HashSet` to store characters in the current window.
2. Move the right pointer and add characters until a duplicate is found.
3. When a duplicate is found, remove the leftmost character and shrink the window from the left.
4. Track the maximum window size throughout.

---

## 🔍 Complexity Analysis

| Type  | Value                                              |
| ----- | -------------------------------------------------- |
| Time  | `O(n)`                                             |
| Space | `O(min(n, m))` where `m` is the character set size |

---

## 🧵 Related Topics

* Hash Table
* Sliding Window
* Two Pointers
* String

---
