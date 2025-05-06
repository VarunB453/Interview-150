# 209. Minimum Size Subarray Sum | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-209.%20Minimum%20Size%20Subarray%20Sum-blue)](https://leetcode.com/problems/minimum-size-subarray-sum/)
[![Language](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)]()

---

## 🧩 Problem Statement

Given an array of positive integers `nums` and a positive integer `target`, return the minimal length of a **contiguous subarray** of which the sum is **greater than or equal to** `target`. If there is no such subarray, return `0` instead.

---

## 🧠 Examples

### Example 1

| Input                              | Output | Explanation                                            |
| ---------------------------------- | ------ | ------------------------------------------------------ |
| `target = 7, nums = [2,3,1,2,4,3]` | `2`    | The subarray `[4,3]` has a sum ≥ 7 and minimal length. |

### Example 2

| Input                        | Output |
| ---------------------------- | ------ |
| `target = 4, nums = [1,4,4]` | `1`    |

### Example 3

| Input                                   | Output |
| --------------------------------------- | ------ |
| `target = 11, nums = [1,1,1,1,1,1,1,1]` | `0`    |

---

## ✅ Constraints

* `1 <= target <= 10⁹`
* `1 <= nums.length <= 10⁵`
* `1 <= nums[i] <= 10⁴`

---

## 💡 Approach

### Sliding Window (O(n) Time Complexity)

* Use two pointers (`start` and `end`) to define a window.
* Expand the window to the right while the sum is less than `target`.
* Shrink it from the left as soon as the sum is equal or greater than `target`, updating the minimum length.
* Repeat until the end of the array.

---

## 🔍 Complexity Analysis

|           | Value  |
| --------- | ------ |
| **Time**  | `O(n)` |
| **Space** | `O(1)` |

---

## 🚀 Follow-up: Binary Search Approach (O(n log n))

* Use a prefix sum array.
* For each prefix sum at index `i`, use binary search to find the smallest index `j` such that `prefix[j] - prefix[i] >= target`.

---

## 📚 Topics

**Tags:**
`Array`, `Sliding Window`, `Binary Search`, `Prefix Sum`

**Hint:**

> Use a sliding window to maintain a valid window with sum ≥ target, and try to minimize its length as you traverse.

---
