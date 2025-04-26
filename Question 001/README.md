# 88. Merge Sorted Array | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-88.%20Merge%20Sorted%20Array-blue)](https://leetcode.com/problems/merge-sorted-array/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://java.com)
[![Optimal Solution](https://img.shields.io/badge/Solution-Optimal-brightgreen)]()

## Problem Statement
Given two sorted integer arrays `nums1` and `nums2`, merge them into a single sorted array in non-decreasing order. The merged array should be stored inside `nums1`, which has enough space (size = `m + n`) to accommodate additional elements from `nums2`.

**Constraints:**
- `nums1.length == m + n`
- `nums2.length == n`
- `0 <= m, n <= 200`
- `1 <= m + n <= 200`
- `-10^9 <= nums1[i], nums2[j] <= 10^9`

## Approach
The solution uses a **three-pointer technique** starting from the end of both arrays to merge them in-place without extra space. This approach efficiently handles the merging process by comparing elements from the end of both arrays and placing the larger element at the current write position.

### Key Steps:
1. Initialize three pointers:
   - `num1` at the last valid element of `nums1` (index `m-1`)
   - `num2` at the last element of `nums2` (index `n-1`)
   - `w` at the last position of `nums1` (index `m+n-1`)
2. Compare elements from `nums1` and `nums2`, and place the larger one at `w`.
3. Decrement the respective pointers until all elements are processed.

## Complexity Analysis
- **Time Complexity:** **O(m + n)**  
  - We traverse each element of `nums1` and `nums2` exactly once.
- **Space Complexity:** **O(1)**  
  - The solution uses constant extra space by merging in-place.

## Example Walkthrough
**Input:**  
`nums1 = [1,2,3,0,0,0]`, `m = 3`  
`nums2 = [2,5,6]`, `n = 3`

**Execution Steps:**
1. Compare `3` (nums1) and `6` (nums2) → Place `6` at index `5`
2. Compare `3` and `5` → Place `5` at index `4`
3. Compare `3` and `2` → Place `3` at index `3`
4. Compare `2` and `2` → Place `2` at index `2`
5. Copy remaining `1` from `nums1` → Final array: `[1,2,2,3,5,6]`

## Test Cases
```java
public static void main(String[] args) {
    Solution sol = new Solution();
    
    // Test Case 1
    int[] nums1 = {1,2,3,0,0,0};
    int[] nums2 = {2,5,6};
    sol.merge(nums1, 3, nums2, 3);
    System.out.println(Arrays.toString(nums1)); // Output: [1, 2, 2, 3, 5, 6]
    
    // Test Case 2: Empty nums2
    int[] nums3 = {1};
    int[] nums4 = {};
    sol.merge(nums3, 1, nums4, 0);
    System.out.println(Arrays.toString(nums3)); // Output: [1]
}
```
