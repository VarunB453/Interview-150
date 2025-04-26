# 45. Jump Game II | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-45.%20Jump%20Game%20II-blue)](https://leetcode.com/problems/jump-game-ii/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://java.com)
[![Optimal Solution](https://img.shields.io/badge/Solution-Optimal-brightgreen)]()

## Problem Statement

You are given a **0-indexed** array of integers `nums` of length `n`. You are initially positioned at `nums[0]`.  
Each element `nums[i]` represents the **maximum length of a forward jump** from index `i`.

In other words, if you are at `nums[i]`, you can jump to any `nums[i + j]` where:

- `0 <= j <= nums[i]`, and
- `i + j < n`

Return the **minimum number of jumps** to reach `nums[n - 1]`.  
It is guaranteed that you can reach the last index.

---

## Constraints:
- `1 <= nums.length <= 10⁴`
- `0 <= nums[i] <= 1000`
- You can always reach the last index

---

## Approach

The algorithm uses a **greedy** approach:

- Track the **farthest** index you can reach at the current step.
- When you reach the `end` of the current jump range, increase the jump count and update the `end` to the farthest point.
- Stop early if you already can reach the last index during the iteration.

### Key Variables:
- `farthest`: The farthest index reachable from the current position.
- `end`: The end of the current jump range.
- `ans`: Number of jumps made.

---

## Complexity Analysis

- **Time Complexity:** `O(n)`  
  - Single pass through the array.
- **Space Complexity:** `O(1)`  
  - Constant extra space used.

---

## Example Walkthroughs

### Example 1:
**Input:** `nums = [2,3,1,1,4]`  
**Output:** `2`

**Explanation:**  
- Jump from index `0` to `1` (value = 3)
- Then jump from index `1` to `4` (value = 4)

---

### Example 2:
**Input:** `nums = [2,3,0,1,4]`  
**Output:** `2`

**Explanation:**  
- Jump from index `0` to `1`
- Then jump from index `1` to `4`

---

## Test Cases

```java
public static void main(String[] args) {
    Solution sol = new Solution();

    int[] nums1 = {2,3,1,1,4};
    System.out.println(sol.jump(nums1)); // Output: 2

    int[] nums2 = {2,3,0,1,4};
    System.out.println(sol.jump(nums2)); // Output: 2

    int[] nums3 = {1,1,1,1};
    System.out.println(sol.jump(nums3)); // Output: 3
}
```

---