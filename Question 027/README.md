# 167. Two Sum II - Input Array Is Sorted | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-167.%20Two%20Sum%20II-blue)](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)]()

---

## 🧩 Problem Statement

You are given a **1-indexed** array of integers `numbers` that is already **sorted in non-decreasing order**, and an integer `target`.

Return **indices of the two numbers** such that they add up to `target`. The solution must use only **constant extra space**.

Return the answer as an integer array `[index1, index2]` of length 2, where:

* `1 <= index1 < index2 <= numbers.length`
* The answer is **guaranteed to be unique**

---

## 🧠 Examples

### Example 1

| Input                                   | Output  |
| --------------------------------------- | ------- |
| `numbers = [2,7,11,15]`<br>`target = 9` | `[1,2]` |

**Explanation:** `2 + 7 = 9`, hence return `[1, 2]`.

---

### Example 2

| Input                               | Output  |
| ----------------------------------- | ------- |
| `numbers = [2,3,4]`<br>`target = 6` | `[1,3]` |

**Explanation:** `2 + 4 = 6`, hence return `[1, 3]`.

---

### Example 3

| Input                               | Output  |
| ----------------------------------- | ------- |
| `numbers = [-1,0]`<br>`target = -1` | `[1,2]` |

**Explanation:** `-1 + 0 = -1`, hence return `[1, 2]`.

---

## ✅ Constraints

* `2 <= numbers.length <= 3 * 10⁴`
* `-1000 <= numbers[i] <= 1000`
* `numbers` is sorted in **non-decreasing order**
* `-1000 <= target <= 1000`
* Exactly **one solution** exists
* You **may not use** the same element twice
* Must use only **constant extra space**

---

## 💡 Approach

We use the **Two Pointers** technique:

* Initialize two pointers: `left` at start, `right` at end
* While `left < right`:

  * Calculate `sum = numbers[left] + numbers[right]`
  * If `sum == target`, return `[left + 1, right + 1]`
  * If `sum < target`, move `left` rightward
  * If `sum > target`, move `right` leftward

This approach works efficiently because the array is **sorted**.

---

## 🔍 Complexity Analysis

| Complexity | Value                            |
| ---------- | -------------------------------- |
| Time       | `O(n)` where `n` is array length |
| Space      | `O(1)` — constant space          |

---

## 📚 Topics

**Array** • **Two Pointers** • **Binary Search (Not needed but related)**

---
