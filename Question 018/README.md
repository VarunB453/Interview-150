# 58. Length of Last Word | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-58.%20Length%20of%20Last%20Word-blue)](https://leetcode.com/problems/length-of-last-word/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)]()

---

## 🧩 Problem Statement

Given a string `s` consisting of **words** and **spaces**, return the **length of the last word** in the string.

A **word** is defined as a maximal substring consisting of **non-space characters only**.

---

## 🧠 Examples

### Example 1:

**Input:**  
`s = "Hello World"`  
**Output:**  
`5`  
**Explanation:**  
The last word is `"World"` which has a length of 5.

---

### Example 2:

**Input:**  
`s = "   fly me   to   the moon  "`  
**Output:**  
`4`  
**Explanation:**  
The last word is `"moon"` which has a length of 4.

---

### Example 3:

**Input:**  
`s = "luffy is still joyboy"`  
**Output:**  
`6`  
**Explanation:**  
The last word is `"joyboy"` which has a length of 6.

---

## ✅ Constraints

- `1 <= s.length <= 10⁴`  
- `s` consists of only English letters and spaces `' '`.  
- There will be at least **one** word in `s`.

---

## 💡 Approach

We iterate **from the end of the string backwards**, skipping trailing spaces, and then count the length of the last word character by character until we hit a space or the start of the string.

---

## 🔍 Complexity Analysis

| Complexity | Value      |
|------------|------------|
| Time       | `O(n)`     |
| Space      | `O(1)`     |

- We scan the string once from the back.  
- No additional space is used beyond variables.

---

## 🧪 Test Cases

```java
public static void main(String[] args) {
    Solution sol = new Solution();

    System.out.println(sol.lengthOfLastWord("Hello World"));              // Output: 5
    System.out.println(sol.lengthOfLastWord("   fly me   to   the moon  ")); // Output: 4
    System.out.println(sol.lengthOfLastWord("luffy is still joyboy"));   // Output: 6
    System.out.println(sol.lengthOfLastWord("a"));                       // Output: 1
}
```

---

## ✨ Notes

- Works even if the string has trailing spaces.
- A clean linear scan from the end avoids any need to split the string or use extra space.

---