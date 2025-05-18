
# 🔁 205. Isomorphic Strings

> 🧩 **Difficulty:** Easy

> 🔗 [LeetCode Link](https://leetcode.com/problems/isomorphic-strings/)

> 💬 *"Two strings are isomorphic if characters in one string can be replaced to get the other."*

---

## 📘 Problem Statement

Given two strings `s` and `t`, determine if they are **isomorphic**.

> Two strings are isomorphic if the characters in `s` can be replaced to get `t`, **preserving the order**.
>
> All occurrences of a character must be replaced with **the same character**, and no two characters may map to the same character, **but a character can map to itself**.

---

### 🧪 Examples

#### Example 1:

```txt
Input: s = "egg", t = "add"
Output: true
Explanation: e → a, g → d
```

#### Example 2:

```txt
Input: s = "foo", t = "bar"
Output: false
Explanation: o → a (conflict)
```

#### Example 3:

```txt
Input: s = "paper", t = "title"
Output: true
Explanation: p→t, a→i, p→t, e→l, r→e
```

---

## ✅ Constraints

* `1 <= s.length, t.length <= 5 * 10⁴`
* `s.length == t.length`
* `s` and `t` consist of any valid ASCII characters

---

## 💡 Your Solution (Java)

Your solution uses **two hash maps** to track the **index of the last occurrence** of each character in both strings. Then it compares these indices to ensure **one-to-one mapping consistency**. 🧠🔥

---

### 💻 Code

```java
class Solution {
  public boolean isIsomorphic(String s, String t) {
    Map<Character, Integer> A = new HashMap<>();
    Map<Character, Integer> B = new HashMap<>();

    for (Integer i = 0; i < s.length(); ++i)
      if (A.put(s.charAt(i), i) != B.put(t.charAt(i), i))
        return false;

    return true;
  }
}
```

---

## 🧠 How It Works

| Step                         | Action                                                                           |
| ---------------------------- | -------------------------------------------------------------------------------- |
| 🧰 `Map<Character, Integer>` | Used to store the latest index seen for each character                           |
| 🪞 `A.put(s.charAt(i), i)`   | Inserts current index for `s[i]` and returns the previous index                  |
| 🔁 Compare A vs B            | If the last seen indices don’t match, mapping is inconsistent, so return `false` |

✅ If all characters pass the consistency check, return `true`.

---

## 🟢 Time & Space Complexity

| Metric   | Complexity                                             |
| -------- | ------------------------------------------------------ |
| ⏱️ Time  | O(n) – Single pass through both strings                |
| 🧠 Space | O(1) – At most 256 entries in each map (ASCII charset) |

---

## 🧱 Related Concepts

* 🔁 Hash Maps
* 🧠 String Mapping
* 🚫 Bijective Relationships

---

## 🏁 Final Thoughts

This is a **clean**, **efficient**, and **non-obvious** solution that leverages Java’s map behavior cleverly.
🔥 You're using **index tracking as a fingerprint**, which avoids complex character-to-character mapping logic entirely.

> 🚀 Elegant and highly performant – great job on this!
