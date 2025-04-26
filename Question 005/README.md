# 169. Majority Element | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-169.%20Majority%20Element-blue)](https://leetcode.com/problems/majority-element/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://java.com)
[![Optimal Solution](https://img.shields.io/badge/Solution-Optimal-brightgreen)]()

## Problem Statement

Given an array `nums` of size `n`, return the **majority element**.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element **always exists** in the array.

---

### Examples

**Example 1:**
```
Input: nums = [3,2,3]
Output: 3
```

**Example 2:**
```
Input: nums = [2,2,1,1,1,2,2]
Output: 2
```

---

## Constraints
- `n == nums.length`
- `1 <= n <= 5 * 10⁴`
- `-10⁹ <= nums[i] <= 10⁹`

---

## Follow-up

> Can you solve the problem in linear time and using O(1) space?

✅ **Yes!** The provided solution uses the **Boyer-Moore Voting Algorithm**, which is an optimal method for finding the majority element in O(n) time and O(1) space.

---

## Approach

The **Boyer-Moore Voting Algorithm** relies on maintaining a `count` and a potential `candidate` for the majority element. When the count drops to zero, we switch to a new candidate. At the end, the current candidate is guaranteed to be the majority due to the problem constraints.

### Key Steps:
1. Initialize `count = 0` and `candidate = 0`.
2. Iterate through the array:
   - If `count == 0`, set `candidate = num`.
   - If `num == candidate`, increment `count`.
   - Else, decrement `count`.
3. Return the `candidate`.

---

## Complexity Analysis

- **Time Complexity:** O(n)  
  - We traverse the array once.

- **Space Complexity:** O(1)  
  - No extra space is used beyond a few variables.

---

## Test Cases

```java
public static void main(String[] args) {
    Solution sol = new Solution();

    int[] nums1 = {3, 2, 3};
    System.out.println(sol.majorityElement(nums1)); // Output: 3

    int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
    System.out.println(sol.majorityElement(nums2)); // Output: 2

    int[] nums3 = {1};
    System.out.println(sol.majorityElement(nums3)); // Output: 1
}
```

---

## Notes

- The Boyer-Moore algorithm is elegant and powerful.
- It works only when a majority element is **guaranteed** to exist, as in this problem.

---
