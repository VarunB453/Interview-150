# 15. 3Sum 

---

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-15.%203Sum-blue)](https://leetcode.com/problems/3sum/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)]()

---

## 🧩 Problem Statement

Given an integer array `nums`, return **all the triplets** `[nums[i], nums[j], nums[k]]` such that:

* `i != j`, `i != k`, and `j != k`
* `nums[i] + nums[j] + nums[k] == 0`

The solution set **must not contain duplicate triplets**.

---

## 🧠 Examples

### Example 1

| Input                     | Output                 |
| ------------------------- | ---------------------- |
| `nums = [-1,0,1,2,-1,-4]` | `[[-1,-1,2],[-1,0,1]]` |

**Explanation:**
These triplets sum to 0 and are unique.

---

### Example 2

| Input            | Output |
| ---------------- | ------ |
| `nums = [0,1,1]` | `[]`   |

**Explanation:**
No three elements sum to 0.

---

### Example 3

| Input            | Output      |
| ---------------- | ----------- |
| `nums = [0,0,0]` | `[[0,0,0]]` |

**Explanation:**
Only one valid triplet.

---

## ✅ Constraints

* `3 <= nums.length <= 3000`
* `-10⁵ <= nums[i] <= 10⁵`

---

## 💡 Approach

### 🔁 Two Pointers after Sorting

1. **Sort** the array.
2. **Fix the first element** (`i` loop).
3. Use **two pointers** (`left` and `right`) to find the remaining two numbers such that the sum is zero.
4. Skip **duplicates** for both `i`, `left`, and `right` to avoid repeated triplets.

---

## 🔍 Complexity Analysis

| Type      | Value                     |
| --------- | ------------------------- |
| **Time**  | `O(n^2)`                  |
| **Space** | `O(1)` (excluding output) |

---

## 🧪 Quick Test

```java
public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.threeSum(new int[]{-1,0,1,2,-1,-4})); // [[-1,-1,2],[-1,0,1]]
    System.out.println(sol.threeSum(new int[]{0,0,0}));          // [[0,0,0]]
    System.out.println(sol.threeSum(new int[]{0,1,1}));          // []
}
```

---

## 📚 Topics

**Topics:** Array • Sorting • Two Pointers

---

## 💡 Hints

1. Fix one number and reduce the problem to 2Sum.
2. Sorting helps eliminate duplicates and improves lookup with two pointers.
3. Skip over duplicate elements to avoid repeating the same triplet.

---
