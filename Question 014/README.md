# 134. Gas Station | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-134.%20Gas%20Station-blue)](https://leetcode.com/problems/gas-station/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Optimal Solution](https://img.shields.io/badge/Solution-Optimal-brightgreen)]()

## Problem Statement

There are `n` gas stations arranged in a **circular route**. Each station has a certain amount of gas, represented by the array `gas`, and it takes a certain amount of gas to travel to the next station, represented by the array `cost`.

You are to start at one of the stations with **an empty tank**, and your goal is to complete the circuit **once** in a **clockwise** direction. Return the **starting station's index** if it is possible. If not, return `-1`.

> If a solution exists, **it is guaranteed to be unique**.

---

### Example 1

**Input:**  
`gas = [1,2,3,4,5]`, `cost = [3,4,5,1,2]`  
**Output:** `3`  
**Explanation:**
Start at index 3 and follow the route:
- Tank = 0 + 4 (gas at station 3) = 4
- Go to station 4: tank = 4 - 1 + 5 = 8
- Go to station 0: tank = 8 - 2 + 1 = 7
- Go to station 1: tank = 7 - 3 + 2 = 6
- Go to station 2: tank = 6 - 4 + 3 = 5
- Go to station 3: tank = 5 - 5 = 0 ✅

---

### Example 2

**Input:**  
`gas = [2,3,4]`, `cost = [3,4,3]`  
**Output:** `-1`  
**Explanation:**
No valid starting station allows a full circuit. Every attempt ends with not enough gas.

---

## Approach

The optimal strategy uses a **greedy approach** with two key ideas:

### Key Observations:
1. If `totalGas < totalCost`, it's **impossible** to complete the circuit.
2. The **first point where the tank goes negative** resets the potential starting station.
   - Why? Because you need a new start where the journey up to that point can be "recovered."

---

### Algorithm Steps:
1. Check if `totalGas >= totalCost`. If not, return `-1`.
2. Traverse the `gas` and `cost` arrays:
   - Keep a running sum of `tank += gas[i] - cost[i]`.
   - If `tank` goes negative:
     - Reset the starting index to `i + 1`
     - Reset `tank` to 0
3. Return the last updated starting index.

---

## Complexity Analysis

- **Time Complexity:** `O(n)`  
  - Single pass through the array.

- **Space Complexity:** `O(1)`  
  - Constant space used for variables.

---

## Test Cases

```java
public static void main(String[] args) {
    Solution sol = new Solution();

    System.out.println(sol.canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}));  // Output: 3
    System.out.println(sol.canCompleteCircuit(new int[]{2,3,4}, new int[]{3,4,3}));          // Output: -1
    System.out.println(sol.canCompleteCircuit(new int[]{5,1,2,3,4}, new int[]{4,4,1,5,1}));  // Output: 4
}
```

---

## Summary

This is a great greedy problem. The trick is to think **globally** for feasibility and **locally** to find the correct starting station. Once you realize that negative tank resets the journey, the rest becomes elegant and intuitive.