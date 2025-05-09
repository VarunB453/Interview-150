# 30: Substring with Concatenation of All Words

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-30-blue)](https://leetcode.com/problems/substring-with-concatenation-of-all-words/)
[![Language](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)]()
[![Topics](https://img.shields.io/badge/Topics-Hash%20Table%2C%20String%2C%20Sliding%20Window-lightgrey)]()

---

## 🧠 The Mystery

Imagine you're handed a bag of words, all cut to the same size. Someone takes all the words, shuffles them into a secret order, glues them together, and hides that sequence somewhere inside a long string `s`. Your job? **Find all the places it’s hidden.**

Not once. Not twice. But **every single time** this secret permutation appears!

---

## 🧩 Problem Statement

Given:

* A string `s`
* A list of words `words`, where all words have the same length

Find **all starting indices** in `s` where the concatenation of **each word in `words` exactly once** (in any order) appears **without any characters in between**.

---

## 🔍 Examples

### 🧪 Example 1

```txt
Input: s = "barfoothefoobarman", words = ["foo", "bar"]
Output: [0, 9]
```

**Why?**

* At index `0`: `"barfoo"` → ✅ valid concat
* At index `9`: `"foobar"` → ✅ another valid concat

---

### 🧪 Example 2

```txt
Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
Output: []
```

**Why?**

* There's no permutation of these words (with one of them appearing **twice**) that fits cleanly.

---

### 🧪 Example 3

```txt
Input: s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
Output: [6, 9, 12]
```

**Found these treasures:**

* `6 → "foobarthe"`
* `9 → "barthefoo"`
* `12 → "thefoobar"`

---

## 📏 Constraints

* `1 <= s.length <= 10⁴`
* `1 <= words.length <= 5000`
* `1 <= words[i].length <= 30`
* All strings consist of lowercase English letters only.

---

## ⚙️ Approach: Sliding Window + Hash Map

Let’s crack this with a **window-sliding word scanner**:

### 📦 Setup

* Let each word be of length `w`, and the number of words be `n`.
* So the total window length = `w * n`.
* Make a **frequency map** of `words` (to track how many times each word should appear).

### 🔁 Slide & Compare

1. Slide across `s`, checking substrings of size `w * n`.
2. In each window:

   * Split it into `w`-length chunks.
   * Check if the words match the frequency map.
3. If they do → bingo! Save the starting index.

---

## 🧮 Complexity

| Metric   | Value      |
| -------- | ---------- |
| ⏱ Time   | `O(N * M)` |
| 🧠 Space | `O(M)`     |

Where `N = s.length` and `M = words.length`.

---

## 🧰 Related Concepts

**Tags:** `Hash Table`, `String`, `Sliding Window`, `Frequency Count`

**Similar Challenges:**

* [76. Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/)
* [438. Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/)

---

## 🔚 Final Thought

This isn't just a string problem. It’s a **hunt for structure inside chaos**. Like finding your shuffled playlist, hidden perfectly in a sea of noise.

---
