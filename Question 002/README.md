# 27. Remove Element | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-27.%20Remove%20Element-blue)](https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com)
[![Optimal Solution](https://img.shields.io/badge/Solution-Optimal-brightgreen)]()

## Problem Statement

Given an integer array `nums` and an integer `val`, remove **all occurrences** of `val` in-place. The order of the elements may be changed. Then return the number of elements in `nums` which are **not equal** to `val`.

### Requirements for Acceptance:

- Modify the array `nums` such that the first `k` elements contain the values not equal to `val`.
- Return `k`.
- The values beyond the first `k` elements do not matter.
- Your solution must operate **in-place** with **O(1)** extra space.

### Custom Judge Behavior:

The solution will be tested with code similar to:

```java
int[] nums = [...]; 
int val = ...;
int[] expectedNums = [...]; // Sorted and excludes all `val`s

int k = removeElement(nums, val);
assert k == expectedNums.length;
Arrays.sort(nums, 0, k);
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
```

If all assertions pass, your solution is correct.

---

## Example 1

**Input:**  
`nums = [3,2,2,3]`, `val = 3`  
**Output:**  
`2`, `nums = [2,2,_,_]`  

**Explanation:**  
Your function should return `k = 2`, and the first two elements of `nums` should be `2`.

---

## Example 2

**Input:**  
`nums = [0,1,2,2,3,0,4,2]`, `val = 2`  
**Output:**  
`5`, `nums = [0,1,4,0,3,_,_,_]`  

**Explanation:**  
The first five elements should be `0`, `1`, `4`, `0`, and `3` (order may vary).

---

## Constraints

- `0 <= nums.length <= 100`
- `0 <= nums[i] <= 50`
- `0 <= val <= 100`

---

## Approach

This solution uses a **two-pointer technique**:
- One pointer iterates through the array.
- The second pointer (`count`) tracks the next available position for a valid (non-`val`) element.
- All non-`val` elements are copied forward to the front of the array.

### Time & Space Complexity:
- **Time Complexity:** `O(n)`  
  (Each element is visited once.)
- **Space Complexity:** `O(1)`  
  (No extra data structures used.)

---
