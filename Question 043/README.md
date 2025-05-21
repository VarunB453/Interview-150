
# 🔗 LeetCode 49 – Group Anagrams

## 📝 Problem Description

Given an array of strings, group the anagrams together.

> An **anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, using **all the original letters exactly once**.

---

### 📥 Example

```text
Input:  strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
Output: [["bat"], ["nat","tan"], ["ate","eat","tea"]]
```

---

## 💡 Approach

We group words by their **sorted character signature**.
Anagrams, once sorted, will have the **same character order**, so we use that as a key 🔑.

---

### 🔍 Explanation

* 🔄 For each string:

  * Convert it to a `char[]`
  * Sort the array (this creates a canonical form for anagrams)
  * Use the sorted string as a **hash map key**
* 🗃️ Group all words with the same key into a list.
* 📤 Return all grouped lists as the final output.

---

## ⏱️ Complexity

* **Time:** O(n \* k log k)
  Where `n` = number of strings, `k` = max string length (due to sorting).

* **Space:** O(n \* k)
  For storing the groups and the intermediate sorted strings.

---

## 🏷️ Tags

`Hash Map` 🗂️ 
`String` ✒️ 
`Sorting` 🔤 
`Grouping` 🧺

---
