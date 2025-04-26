# 121. Best Time to Buy and Sell Stock | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-121.%20Best%20Time%20to%20Buy%20and%20Sell%20Stock-blue)](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)  
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://java.com)  
[![Optimal Solution](https://img.shields.io/badge/Solution-Optimal-brightgreen)]()

---

## Problem Statement

You are given an array `prices` where `prices[i]` represents the price of a given stock on the `i`-th day.

You want to maximize your profit by choosing a single day to **buy** one stock and choosing a **different day in the future to sell** that stock.

Return the maximum profit you can achieve from this transaction. If no profit is possible, return `0`.

---

## Examples

### Example 1:
**Input:**  
`prices = [7,1,5,3,6,4]`  
**Output:**  
`5`  
**Explanation:**  
Buy on day 2 (price = 1) and sell on day 5 (price = 6). Profit = 6 - 1 = 5.

---

### Example 2:
**Input:**  
`prices = [7,6,4,3,1]`  
**Output:**  
`0`  
**Explanation:**  
No transaction is done since prices keep going down.

---

## Constraints

- `1 <= prices.length <= 10^5`  
- `0 <= prices[i] <= 10^4`

---

## Approach

This solution scans the array once, keeping track of the **minimum price seen so far**, and at each step calculates the potential profit if we sold on that day. The **maximum of all such profits** is returned.

### Key Idea:
- Track the lowest price (`minPrice`) as we iterate.
- At each price, compute the profit if we sold on that day: `price - minPrice`.
- Update the `maxProfit` if this is the best we've seen.

---

## Complexity Analysis

- **Time Complexity:** **O(n)**  
  - We iterate over the array once.

- **Space Complexity:** **O(1)**  
  - Constant extra space is used.

---

## Test Cases

```java
public static void main(String[] args) {
    Solution sol = new Solution();

    // Test Case 1
    int[] prices1 = {7,1,5,3,6,4};
    System.out.println(sol.maxProfit(prices1)); // Output: 5

    // Test Case 2
    int[] prices2 = {7,6,4,3,1};
    System.out.println(sol.maxProfit(prices2)); // Output: 0

    // Test Case 3
    int[] prices3 = {2,4,1};
    System.out.println(sol.maxProfit(prices3)); // Output: 2

    // Test Case 4
    int[] prices4 = {1,2};
    System.out.println(sol.maxProfit(prices4)); // Output: 1

    // Test Case 5: All same prices
    int[] prices5 = {3,3,3,3,3};
    System.out.println(sol.maxProfit(prices5)); // Output: 0
}
```

---