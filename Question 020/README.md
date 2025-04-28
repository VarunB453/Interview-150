# 14. Longest Common Prefix | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-14.%20Longest%20Common%20Prefix-blue)](https://leetcode.com/problems/longest-common-prefix/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)]()

---

## 🧩 Problem Statement  

Write a function to find the **longest common prefix** string amongst an array of strings.

If there is no common prefix, return an empty string `""`.

---

## 🧠 Examples  

### Example 1  

| Input | Output |
|-------|--------|
| `strs = ["flower","flow","flight"]` | `"fl"` |

**Explanation:**  
The longest common prefix among all strings is `"fl"`.

---

### Example 2  

| Input | Output |
|-------|--------|
| `strs = ["dog","racecar","car"]` | `""` |

**Explanation:**  
There is no common prefix among the input strings, so return an empty string.

---

## ✅ Constraints  

- `1 <= strs.length <= 200`  
- `0 <= strs[i].length <= 200`  
- `strs[i]` consists of only lowercase English letters.

---

## 💡 Approach  

### 🔄 Vertical Scanning  

1. Iterate over the characters of the first string.
2. For each character position, check if all strings have the same character at that position.
3. If a mismatch is found, return the substring up to that point.

---

## 🔍 Complexity Analysis  

|                | Value |
|----------------|-------|
| **Time**       | `O(m * n)` — Where `m` is the length of the shortest string, and `n` is the number of strings |
| **Space**      | `O(1)` — No extra space needed |

---

## 🧪 Quick Test  

```java
public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.longestCommonPrefix(new String[]{"flower","flow","flight"})); // "fl"
    System.out.println(sol.longestCommonPrefix(new String[]{"dog","racecar","car"}));     // ""
}
```

---

## ✨ Possible Improvements  

- Use binary search to find the common prefix length more efficiently (`O(n * log m)`).
- Trie (Prefix Tree) solution can be considered if there are many strings and repeated prefixes.

---

## 📚 Topics & Hint  

**Topics:** String • Trie  

**Hint:**  
> Compare characters one by one vertically across all strings.

---

