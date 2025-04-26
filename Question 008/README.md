# 122. Best Time to Buy and Sell Stock II 

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-122.%20Best%20Time%20to%20Buy%20and%20Sell%20Stock%20II-blue)](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/)  
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://java.com)  
[![Optimal Solution](https://img.shields.io/badge/Solution-Optimal-brightgreen)]()

---

## Problem Statement

You are given an integer array `prices` where `prices[i]` is the price of a given stock on the `i`-th day.

On each day, you may decide to buy and/or sell the stock.  
You **can only hold at most one share of the stock at any time**, but you **can buy and sell on the same day**.

Return the **maximum profit** you can achieve.

---

## Examples

### Example 1:
**Input:**  
`prices = [7,1,5,3,6,4]`  
**Output:**  
`7`  
**Explanation:**  
- Buy on day 2 (price = 1), sell on day 3 (price = 5), profit = 4  
- Buy on day 4 (price = 3), sell on day 5 (price = 6), profit = 3  
- Total = 4 + 3 = 7

---

### Example 2:
**Input:**  
`prices = [1,2,3,4,5]`  
**Output:**  
`4`  
**Explanation:**  
- Buy on day 1 (price = 1), sell on day 5 (price = 5), profit = 4  
- Total = 4

---

### Example 3:
**Input:**  
`prices = [7,6,4,3,1]`  
**Output:**  
`0`  
**Explanation:**  
- No profitable transactions possible.

---

## Constraints

- `1 <= prices.length <= 3 * 10^4`  
- `0 <= prices[i] <= 10^4`

---

## Approach

This is a **greedy problem**.  
Since you can sell and buy on the same day, the idea is to **add every upward trend**.

### Strategy:

- If `prices[i] > prices[i-1]`, take the profit.  
- Add up all the gains from every ascending pair of days.

---

## Simpler Greedy Solution

```java
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
```

---

## Complexity Analysis

- **Time Complexity:** O(n)  
  - One pass through the array.

- **Space Complexity:**  
  - DP: O(n)  
  - Greedy: O(1)

---

## Test Cases

```java
public static void main(String[] args) {
    Solution sol = new Solution();

    int[] prices1 = {7,1,5,3,6,4};
    System.out.println(sol.maxProfit(prices1)); // Output: 7

    int[] prices2 = {1,2,3,4,5};
    System.out.println(sol.maxProfit(prices2)); // Output: 4

    int[] prices3 = {7,6,4,3,1};
    System.out.println(sol.maxProfit(prices3)); // Output: 0

    int[] prices4 = {2,1,2,0,1};
    System.out.println(sol.maxProfit(prices4)); // Output: 2

    int[] prices5 = {3,3,3,3,3};
    System.out.println(sol.maxProfit(prices5)); // Output: 0
}
```

---