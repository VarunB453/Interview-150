# 151. Reverse Words in a String | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-151.%20Reverse%20Words%20in%20a%20String-blue)](https://leetcode.com/problems/reverse-words-in-a-string/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)]()

---

## 🧩 Problem Statement  

Given an input string `s`, reverse the order of the words.

- A **word** is defined as a sequence of non-space characters.
- Words are separated by at least one space.
- The returned string should have words separated by a **single space** with **no leading or trailing spaces**.

---

## 🧠 Examples  

### Example 1  

| Input | Output |
|-------|--------|
| `s = "the sky is blue"` | `"blue is sky the"` |

---

### Example 2  

| Input | Output |
|-------|--------|
| `s = "  hello world  "` | `"world hello"` |

**Explanation:**  
The reversed string should not contain leading or trailing spaces.

---

### Example 3  

| Input | Output |
|-------|--------|
| `s = "a good   example"` | `"example good a"` |

**Explanation:**  
Multiple spaces between words must be reduced to a single space.

---

## ✅ Constraints  

- `1 <= s.length <= 10⁴`
- `s` contains English letters (upper-case and lower-case), digits, and spaces `' '`.
- There is at least **one word** in `s`.

---

## 💡 Approach  

- **Trim** the string to remove leading and trailing spaces.
- **Split** the string by spaces using regex to handle multiple spaces.
- **Reverse** the list of words.
- **Join** them with a single space.

---

## 🔍 Complexity Analysis  

|                | Value |
|----------------|-------|
| **Time**       | `O(n)` — where `n` is the length of the string |
| **Space**      | `O(n)` — for storing the words array and the result |

---

## 🧪 Quick Test  

```java
public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.reverseWords("the sky is blue"));          // "blue is sky the"
    System.out.println(sol.reverseWords("  hello world  "));           // "world hello"
    System.out.println(sol.reverseWords("a good   example"));          // "example good a"
}
```

---

## ✨ Notes  

- `trim()` ensures there are no extra spaces at the ends.
- Splitting using `\\s+` handles **multiple spaces** between words automatically.
- We use a `StringBuilder` for efficient string concatenation.

---

## 📚 Topics & Hint  

**Topics:** String • Two Pointers  

**Hint:**  
> Trim spaces, split the string into words, reverse the list, and join them with a single space.

---