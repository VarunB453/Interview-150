
# 🧩 LeetCode 290 - Word Pattern

## 📝 Problem Description

Given a pattern string 🧵 and a sentence 📜, determine if the sentence **follows** the same pattern.

> A sentence follows a pattern if there's a **one-to-one mapping** between each letter in the pattern and each word in the sentence.

### 📥 Examples

```
Input:  pattern = "abba", s = "dog cat cat dog"
Output: ✅ true

Input:  pattern = "abba", s = "dog cat cat fish"
Output: ❌ false

Input:  pattern = "aaaa", s = "dog cat cat dog"
Output: ❌ false
```

## 💡 Approach

To solve this, we use **two hash maps**:

🔹 One to map each pattern character ➡️ index
🔹 One to map each word in the string ➡️ index

If both maps agree on how elements are mapped at every step ➡️ the pattern is valid ✅.

---

### 🔍 How It Works

* ✂️ Split the string `s` into words.
* ⚖️ If the count of words ≠ length of pattern → return `false`.
* 🔄 Loop through pattern and word list:

  * Update both maps with the current index.
  * If the previous values from the maps don't match ➡️ invalid pattern ❌.
* If loop completes with no mismatches ➡️ valid pattern ✅.

## ⏱️ Time & Space Complexity

* **Time:** O(n) — single pass through the pattern/words.
* **Space:** O(n) — space for two hash maps.

## 🏷️ Tags

`HashMap` 🗺️ • `String` ✒️ • `Pattern Matching` 🔤

---
