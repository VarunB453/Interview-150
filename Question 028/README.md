# 11. Container With Most Water

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-11.%20Container%20With%20Most%20Water-blue)](https://leetcode.com/problems/container-with-most-water/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)]()

---
You are given an array `height` of non-negative integers, where each element represents the height of a vertical line drawn at that index. The goal is to find two lines that, together with the x-axis, form a container that holds the maximum amount of water.

The amount of water a container can hold is determined by:

* The **shorter** of the two lines (as water can't spill over a taller side),
* Multiplied by the **distance** between those two lines (width).

---

## 💡 Optimal Solution — Two-Pointer Technique

### 🔧 Approach

To solve this efficiently in linear time, use the **two-pointer approach**:

1. **Initialize two pointers**:

   * `left` at the start (`0`)
   * `right` at the end (`height.length - 1`)

2. **Initialize** `maxArea = 0`.

3. **While** `left < right`:

   * Calculate the current area:

     ```java
     area = min(height[left], height[right]) * (right - left);
     ```
   * Update `maxArea` if the current `area` is larger.
   * Move the pointer pointing to the **shorter** line:

     * If `height[left] < height[right]`, increment `left`
     * Otherwise, decrement `right`

4. Return `maxArea`.

This method works because moving the pointer with the shorter height may lead to a taller boundary and thus a potentially larger area.

---

## 🧪 Examples

### Example 1

![Container Problem Example](https://github.com/user-attachments/assets/0e309fdd-c14d-48a1-a5e3-c34f9559bfbd)

**Input:**
`height = [1,8,6,2,5,4,8,3,7]`

**Output:**
`49`

**Explanation:**
The two lines at index 1 (height = 8) and index 8 (height = 7) form the container with the maximum area:
`min(8, 7) * (8 - 1) = 7 * 7 = 49`

---

### Example 2

**Input:**
`height = [1,1]`

**Output:**
`1`

**Explanation:**
Only one possible container between indices 0 and 1:
`min(1, 1) * (1 - 0) = 1`

---

## 📌 Constraints

* `2 <= height.length <= 10⁵`
* `0 <= height[i] <= 10⁴`

---

## 🧮 Time & Space Complexity

| Metric    | Complexity      |
| --------- | --------------- |
| **Time**  | O(n)            |
| **Space** | O(1) – constant |

---
