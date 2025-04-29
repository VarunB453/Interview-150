# 28. Find the Index of the First Occurrence in a String | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-28.%20Find%20the%20Index%20of%20the%20First%20Occurrence%20in%20a%20String-blue)](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)]()

---

## 🧩 Problem Statement

Given two strings `needle` and `haystack`, return the **index of the first occurrence** of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.

---

## 🧠 Examples

### Example 1  

| Input                        | Output |
|-----------------------------|--------|
| `haystack = "sadbutsad"`    | `0`    |
| `needle = "sad"`            |        |

**Explanation:**  
"**sad**" occurs at index **0** and **6**, but the **first** occurrence is at index **0**.

---

### Example 2  

| Input                        | Output |
|-----------------------------|--------|
| `haystack = "leetcode"`     | `-1`   |
| `needle = "leeto"`          |        |

**Explanation:**  
"leeto" is not a substring of "leetcode", so we return `-1`.

---

## ✅ Constraints

- `1 <= haystack.length, needle.length <= 10⁴`
- `haystack` and `needle` consist only of lowercase English characters

---

## 💡 Approach

### 🔸 Option 1: Built-in Method

- Use Java's built-in `indexOf()` method which returns the first index of a substring or `-1` if not found.

### 🔸 Option 2: Manual Search (Brute Force)

- Loop through each possible starting index in `haystack`.
- For each index, check if the substring matches `needle`.
- Return the first index where match is found.

---

## 🔍 Complexity Analysis

|                | Value |
|----------------|-------|
| **Time**       | `O(n * m)` — where `n` is `haystack.length()` and `m` is `needle.length()` |
| **Space**      | `O(1)` — no extra space used |

---

## 🧪 Java Solution

### ✅ Using Built-in Method

```java
class Solution {
  public int strStr(String haystack, String needle) {
    return haystack.indexOf(needle);
  }
}
```

---

### 🛠 Manual Implementation (Brute Force)

```java
class Solution {
  public int strStr(String haystack, String needle) {
    int h = haystack.length(), n = needle.length();
    for (int i = 0; i <= h - n; i++) {
      if (haystack.substring(i, i + n).equals(needle)) {
        return i;
      }
    }
    return -1;
  }
}
```

---

## 📚 Topics & Hint

**Topics:** String • Two Pointers

**Hint:**  
> Loop through each character in `haystack`, and for each one, check if the following characters match `needle`.

---
