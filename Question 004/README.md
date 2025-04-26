# 80. Remove Duplicates from Sorted Array II | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-80.%20Remove%20Duplicates%20from%20Sorted%20Array%20II-blue)](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://java.com)
[![Optimal Solution](https://img.shields.io/badge/Solution-Optimal-brightgreen)]()

## Problem Statement

Given an integer array `nums` sorted in **non-decreasing** order, remove some duplicates **in-place** such that each unique element appears **at most twice**. The relative order of the elements should be kept the same.

**Important:**  
You must do this by **modifying the input array in-place** with **O(1)** extra memory.

Return `k` — the number of unique elements (with at most two duplicates) in the updated array. The first `k` elements of `nums` should contain the final result.

---

### Constraints:

- `1 <= nums.length <= 3 * 10⁴`
- `-10⁴ <= nums[i] <= 10⁴`
- `nums` is sorted in non-decreasing order

---

## Approach

The solution uses a **two-pointer approach** to overwrite extra duplicates in-place.

### Key Observations:

- A number can appear **at most twice**.
- We can **freely overwrite** values in `nums` after the position we’ve processed.
- For index `i` in `nums`, we only keep the current number if:
  - `i < 2` (always keep the first two)
  - OR `num > nums[i - 2]` (it's not a third+ duplicate)

---

## Complexity Analysis

- **Time Complexity:** **O(n)**  
  - Iterate through the array once.
  
- **Space Complexity:** **O(1)**  
  - In-place modification without extra space.

---

## Example Walkthrough

### Example 1:

**Input:**  
`nums = [1,1,1,2,2,3]`

**Output:**  
`k = 5`, `nums = [1,1,2,2,3,_]`

**Explanation:**  
Only two `1`s and `2`s are allowed. Third `1` is removed.

---

### Example 2:

**Input:**  
`nums = [0,0,1,1,1,1,2,3,3]`

**Output:**  
`k = 7`, `nums = [0,0,1,1,2,3,3,_,_]`

**Explanation:**  
Keep only the first two `1`s. Third and fourth are removed.

---

## Test Cases

```java
public static void main(String[] args) {
    Solution sol = new Solution();

    int[] nums1 = {1,1,1,2,2,3};
    int k1 = sol.removeDuplicates(nums1);
    System.out.println(k1); // Output: 5
    System.out.println(Arrays.toString(Arrays.copyOfRange(nums1, 0, k1))); // Output: [1, 1, 2, 2, 3]

    int[] nums2 = {0,0,1,1,1,1,2,3,3};
    int k2 = sol.removeDuplicates(nums2);
    System.out.println(k2); // Output: 7
    System.out.println(Arrays.toString(Arrays.copyOfRange(nums2, 0, k2))); // Output: [0, 0, 1, 1, 2, 3, 3]
}
```