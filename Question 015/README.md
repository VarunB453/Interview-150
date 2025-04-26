# 135. Candy | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-135.%20Candy-blue)](https://leetcode.com/problems/candy/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)]()

---

## 🧩 Problem Statement

There are `n` children standing in a line. Each child is assigned a rating value given in the integer array `ratings`.

You must distribute candies to these children such that:

1. Each child gets **at least one** candy.
2. Any child with a **higher rating than their neighbor** must get **more candies**.

Return the **minimum** number of candies you must distribute to satisfy these conditions.

---

## 🧠 Examples

### Example 1:

**Input:**  
`ratings = [1, 0, 2]`  
**Output:**  
`5`  
**Explanation:**  
Candies distribution: `[2, 1, 2]`  
Child at index 0 and 2 get more than their lower-rated neighbors.

---

### Example 2:

**Input:**  
`ratings = [1, 2, 2]`  
**Output:**  
`4`  
**Explanation:**  
Candies distribution: `[1, 2, 1]`  
Second child gets more than the first, third gets 1 since it's not greater than the second.

---

## ✅ Constraints

- `1 <= ratings.length <= 2 * 10⁴`
- `0 <= ratings[i] <= 2 * 10⁴`

---

## 💡 Approach

This is a classic **Greedy** problem.

### Key Insight:
To satisfy the conditions:
- Traverse **left to right**: ensure children with higher ratings than the left neighbor get more candies.
- Traverse **right to left**: ensure children with higher ratings than the right neighbor get more candies.
- Take the **max** of both left and right passes per child.

---

## 🔍 Complexity Analysis

- **Time Complexity:** `O(n)`  
  - Two linear scans through the array
- **Space Complexity:** `O(n)`  
  - Two auxiliary arrays for left and right traversal

---

## 🧪 Test Cases

```java
public static void main(String[] args) {
    Solution sol = new Solution();

    System.out.println(sol.candy(new int[]{1, 0, 2})); // Output: 5
    System.out.println(sol.candy(new int[]{1, 2, 2})); // Output: 4
    System.out.println(sol.candy(new int[]{1, 3, 4, 5, 2})); // Output: 11
}
```

---

## ✨ Possible Improvements

- Space Optimization: Instead of two full arrays, use a single array and update in two passes.
 
 ---