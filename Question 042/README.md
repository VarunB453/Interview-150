
# 🔤 LeetCode 242 – Valid Anagram

## 📝 Problem Description

Given two strings `s` and `t`, determine if `t` is an **anagram** of `s`.

> An **anagram** is a word or phrase formed by rearranging the letters of another, using **all original letters exactly once**.

---

### 📥 Examples

```text
Input:  s = "anagram", t = "nagaram"
Output: ✅ true

Input:  s = "rat", t = "car"
Output: ❌ false
```

---

## 💡 Approach

This solution uses a **frequency counter** 🧮 implemented via an integer array.

### ✅ Key Idea:

If two strings are anagrams:

* Every character must appear the **same number of times** in both strings.

---

### 🔍 Explanation

* 🧪 Check if strings are the same length — if not, they can't be anagrams.
* 🆙 Count each letter in `s` using a `count[]` array.
* 🔽 Decrease the count for each letter in `t`. If any letter is already at 0, it means `t` has an extra letter not in `s`.
* ✅ If the loop finishes without returning false, the strings are valid anagrams.

---

## ⏱️ Complexity

* **Time:** O(n) — single pass through both strings.
* **Space:** O(1) — fixed array size (26 letters).

---

## 🏷️ Tags

`Hash Table` 🗂️ • `String` ✒️ • `Counting` 🔢

---
