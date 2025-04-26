# 189. Rotate Array | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-189.%20Rotate%20Array-blue)](https://leetcode.com/problems/rotate-array/)  
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://java.com)  
[![Optimal Solution](https://img.shields.io/badge/Solution-Optimal-brightgreen)]()

## Problem Statement

Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

### Example 1:
**Input:**  
`nums = [1,2,3,4,5,6,7]`, `k = 3`  
**Output:**  
`[5,6,7,1,2,3,4]`

### Example 2:
**Input:**  
`nums = [-1,-100,3,99]`, `k = 2`  
**Output:**  
`[3,99,-1,-100]`

### Constraints:
- `1 <= nums.length <= 10^5`
- `-2^31 <= nums[i] <= 2^31 - 1`
- `0 <= k <= 10^5`

---

## Approach

This solution rotates the array **in-place** using **O(1)** extra space by applying the **reverse technique**.

### Key Idea:
To rotate the array to the right by `k` steps:
1. Reverse the entire array.
2. Reverse the first `k` elements.
3. Reverse the remaining `n-k` elements.

This approach avoids the need for additional memory and achieves optimal time and space complexity.

### Key Steps:
```java
1. k %= nums.length
2. reverse(nums, 0, nums.length - 1)
3. reverse(nums, 0, k - 1)
4. reverse(nums, k, nums.length - 1)
```
---

## Complexity Analysis

- **Time Complexity:** **O(n)**  
  - We reverse the array three times, each in linear time.
  
- **Space Complexity:** **O(1)**  
  - In-place reversal; no extra space is used.

---

## Test Cases

```java
public static void main(String[] args) {
    Solution sol = new Solution();
    
    // Test Case 1
    int[] nums1 = {1,2,3,4,5,6,7};
    sol.rotate(nums1, 3);
    System.out.println(Arrays.toString(nums1)); // Output: [5,6,7,1,2,3,4]

    // Test Case 2
    int[] nums2 = {-1,-100,3,99};
    sol.rotate(nums2, 2);
    System.out.println(Arrays.toString(nums2)); // Output: [3,99,-1,-100]

    // Test Case 3: k larger than length
    int[] nums3 = {1,2};
    sol.rotate(nums3, 5);
    System.out.println(Arrays.toString(nums3)); // Output: [2,1]

    // Test Case 4: k = 0 (no rotation)
    int[] nums4 = {1,2,3};
    sol.rotate(nums4, 0);
    System.out.println(Arrays.toString(nums4)); // Output: [1,2,3]
}
```

---