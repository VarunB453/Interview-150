# 55. Jump Game | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-55.%20Jump%20Game-blue)](https://leetcode.com/problems/jump-game/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://java.com)
[![Optimal Solution](https://img.shields.io/badge/Solution-Optimal-brightgreen)]()

## 🧩 Problem Statement

You are given an integer array `nums`. You are initially positioned at the array's first index, and each element in the array represents your **maximum jump length** at that position.

Return `true` if you can reach the last index, or `false` otherwise.

---

## 🔐 Constraints
- `1 <= nums.length <= 10⁴`
- `0 <= nums[i] <= 10⁵`

---

## 🚀 Approach

This solution uses a **greedy strategy** to keep track of the farthest index we can reach as we iterate through the array:

### Logic:
- Initialize a variable `reach` to keep track of the maximum reachable index.
- Iterate through the array.
- If the current index is ever greater than `reach`, return `false`.
- Update `reach = max(reach, i + nums[i])`.
- If the loop finishes, it means the last index is reachable.

---

## 🧠 Complexity Analysis

| Complexity      | Value  |
|-----------------|--------|
| Time Complexity | O(n)   |
| Space Complexity| O(1)   |

- Only a single pass through the array is needed.
- No extra memory is used aside from a few variables.

---

## 🧪 Example Walkthroughs

### Example 1:
**Input:** `nums = [2,3,1,1,4]`  
**Output:** `true`

**Explanation:**  
- Jump from index 0 → 1 (jump length 2), then from 1 → 4 (jump length 3).

---

### Example 2:
**Input:** `nums = [3,2,1,0,4]`  
**Output:** `false`

**Explanation:**  
- You’ll get stuck at index 3, which has a jump length of 0, making it impossible to proceed.

---

## 🧪 Test Case Snippet (Optional)

```java
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.canJump(new int[]{2,3,1,1,4})); // true
        System.out.println(sol.canJump(new int[]{3,2,1,0,4})); // false
    }
}
```

---
