# 238. Product of Array Except Self | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-238.%20Product%20of%20Array%20Except%20Self-blue)](https://leetcode.com/problems/product-of-array-except-self/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)]()

---

## 🧩 Problem Statement

Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the **product of all the elements of `nums` except `nums[i]`**.

You must solve it **without using division** and in **O(n) time**.

Also, try to solve it using **constant space** (excluding the output array).

---

## 🧠 Approach

### Plan

To find the product of all elements except the current one at index `i`, we can do the following:

1. **Left Pass**: Store the product of all elements **before** index `i` in the result array.
2. **Right Pass**: Multiply each element in the result array by the product of all elements **after** index `i`.

This way, each `result[i] = (product of elements before i) * (product of elements after i)`.

---

## 🔍 Complexity Analysis

- **Time Complexity:** `O(n)`  
  Two passes through the array.
  
- **Space Complexity:** `O(1)` extra space  
  The output array is not counted in space complexity, and no additional arrays are used.

---

## 🧪 Examples

### Example 1:

**Input:**  
`nums = [1,2,3,4]`  
**Output:**  
`[24,12,8,6]`  
**Explanation:**  
- Product of all elements except index 0 → `2*3*4 = 24`  
- Index 1 → `1*3*4 = 12`, and so on.

---

### Example 2:

**Input:**  
`nums = [-1,1,0,-3,3]`  
**Output:**  
`[0,0,9,0,0]`  
**Explanation:**  
- The presence of `0` affects all other products.

---

## 🧪 Test Cases

```java
public static void main(String[] args) {
    Solution sol = new Solution();

    System.out.println(Arrays.toString(sol.productExceptSelf(new int[]{1, 2, 3, 4})));      // [24, 12, 8, 6]
    System.out.println(Arrays.toString(sol.productExceptSelf(new int[]{-1, 1, 0, -3, 3}))); // [0, 0, 9, 0, 0]
    System.out.println(Arrays.toString(sol.productExceptSelf(new int[]{2, 3})));            // [3, 2]
}
```

---

## ✨ Follow-up Challenge

- Implement the algorithm using **only constant space** (excluding the result array).
- Can you modify the input array itself (if allowed) to store intermediate results?

---