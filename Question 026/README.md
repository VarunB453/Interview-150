# 392. Is Subsequence | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-392.%20Is%20Subsequence-blue)](https://leetcode.com/problems/is-subsequence/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)]()

---

## 🧩 Problem Statement

Given two strings `s` and `t`, return `true` if `s` is a **subsequence** of `t`, and `false` otherwise.

A **subsequence** of a string is a new string formed from the original string by deleting some (or no) characters without changing the relative order of the remaining characters.

---

## 🧠 Examples

### Example 1

| Input                     | Output |
| ------------------------- | ------ |
| `s = "abc", t = "ahbgdc"` | `true` |

**Explanation:**
Characters `'a'`, `'b'`, `'c'` appear in the same order in `t`.

---

### Example 2

| Input                     | Output  |
| ------------------------- | ------- |
| `s = "axc", t = "ahbgdc"` | `false` |

**Explanation:**
Character `'x'` does not appear in `t`.

---

## ✅ Constraints

* `0 <= s.length <= 100`
* `0 <= t.length <= 10⁴`
* `s` and `t` consist only of lowercase English letters

---

## 🔄 Follow-up

If you need to check **billions** of different strings `s1, s2, ..., sk` against the same `t`, consider **preprocessing `t`** using character indexing and binary search to quickly verify subsequences for multiple `s`.

---

## 💡 Approach

Use the **Two Pointers** technique:

* One pointer for `s`, one for `t`.
* Iterate over `t`, and move the pointer in `s` when there's a match.
* If we reach the end of `s`, it's a valid subsequence.

---

## 🔍 Complexity Analysis

| Complexity | Value                             |
| ---------- | --------------------------------- |
| **Time**   | `O(n)` where `n` is length of `t` |
| **Space**  | `O(1)` — No extra space used      |

---

## 📚 Topics & Hint

**Topics:** Two Pointers • String • Dynamic Programming (for the follow-up)

**Hint:**

> For large-scale queries, build a character-index mapping from `t` and use binary search for each character in `s`.

---
