# 274. H-Index | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-274.%20H--Index-blue)](https://leetcode.com/problems/h-index/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com)
[![Optimal Solution](https://img.shields.io/badge/Solution-Optimal-brightgreen)]()

## Problem Statement

Given an array of integers `citations` where `citations[i]` is the number of citations a researcher received for their `i-th` paper, return the researcher's **h-index**.

According to Wikipedia:
> A scientist has an index **h** if **h** of their **n** papers have at least **h** citations each, and the other **n − h** papers have no more than **h** citations each.

---

## Example 1

**Input:**  
`citations = [3,0,6,1,5]`  
**Output:**  
`3`  

**Explanation:**  
There are 3 papers with at least 3 citations (`[3, 6, 5]`). The other 2 have ≤ 3 citations.

---

## Example 2

**Input:**  
`citations = [1,3,1]`  
**Output:**  
`1`

---

## Constraints

- `1 <= citations.length <= 5000`
- `0 <= citations[i] <= 1000`

---

## Approach

This solution uses **binary search** to find the maximum value `h` such that there are at least `h` papers with `h` or more citations.

### Key Function:

```java
static boolean hasAtLeastHPapersWithHCitations(int h, int[] citations) {
    int count = 0;
    for (int i : citations) {
        if (i >= h) count++;
    }
    return count >= h;
}
```

### Binary Search Logic:

```java
public int hIndex(int[] citations) {
    int low = 0, high = citations.length;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (hasAtLeastHPapersWithHCitations(mid, citations)) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return high;
}
```

---

## Time & Space Complexity

- **Time Complexity:** `O(n log n)`  
  (Binary search with up to `log n` iterations, each checking all `n` elements.)

- **Space Complexity:** `O(1)`  
  (Only constant extra space used.)

---