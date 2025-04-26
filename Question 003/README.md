# 26. Remove Duplicates from Sorted Array | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-26.%20Remove%20Duplicates%20from%20Sorted%20Array-blue)](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://java.com)
[![Optimal Solution](https://img.shields.io/badge/Solution-Optimal-brightgreen)]()

## Problem Statement
Given an integer array `nums` **sorted in non-decreasing order**, remove the **duplicates in-place** such that each unique element appears only once. The relative order of the elements should be kept the same. Return the number of unique elements.

To be accepted:
- Modify `nums` such that the first `k` elements contain the unique elements in the original order.
- Return `k`.
- The elements beyond `k` are not checked by the judge.

### Constraints:
- `1 <= nums.length <= 3 * 10⁴`
- `-100 <= nums[i] <= 100`
- `nums` is sorted in non-decreasing order

---

## Approach
The solution uses a **two-pointer technique**:
- One pointer `i` keeps track of the position to place the next unique element.
- The enhanced for-loop iterates through each element.
- If the current number is different from the last placed number, it’s placed in the next available position.

### Key Steps:
1. Start with `i = 0`.
2. For each `num` in `nums`:
   - If it’s the first element or different from the last unique one, assign it to `nums[i]` and increment `i`.
3. Return `i` — the count of unique elements.

---

## Complexity Analysis
- **Time Complexity:** `O(n)`  
  - Traverse each element once.
- **Space Complexity:** `O(1)`  
  - Modifies the array in-place without extra space.

---

## Example Walkthroughs

### Example 1:
**Input:** `nums = [1,1,2]`  
**Output:** `2`, `nums = [1,2,_]`

**Explanation:**  
- Duplicates of `1` are removed.
- First two elements are unique: `[1, 2]`

---

### Example 2:
**Input:** `nums = [0,0,1,1,1,2,2,3,3,4]`  
**Output:** `5`, `nums = [0,1,2,3,4,_,_,_,_,_]`

**Explanation:**  
- Unique elements are copied to the start of the array.

---

## Test Cases
```java
public static void main(String[] args) {
    Solution sol = new Solution();

    int[] nums1 = {1,1,2};
    int k1 = sol.removeDuplicates(nums1);
    System.out.println(k1); // Output: 2
    System.out.println(Arrays.toString(Arrays.copyOfRange(nums1, 0, k1))); // Output: [1, 2]

    int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
    int k2 = sol.removeDuplicates(nums2);
    System.out.println(k2); // Output: 5
    System.out.println(Arrays.toString(Arrays.copyOfRange(nums2, 0, k2))); // Output: [0, 1, 2, 3, 4]
}
```
