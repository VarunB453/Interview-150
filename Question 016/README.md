# 42. Trapping Rain Water | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-42.%20Trapping%20Rain%20Water-blue)](https://leetcode.com/problems/trapping-rain-water/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)]()

---

## 🧩 Problem Statement  

You are given an integer array `height` of length **n** where each element represents the elevation of a bar (*width = 1*).  
After raining, water is trapped in the “valleys” between bars.  
Return **the total units of water** that can be trapped.

---

## 🧠 Examples  

| Input | Output | Explanation |
|-------|--------|-------------|
| `height = [0,1,0,2,1,0,1,3,2,1,2,1]` | `6` | The shaded blue area (6 squares) illustrates trapped water. |
| `height = [4,2,0,3,2,5]` | `9` | 9 units of water are contained. |

---

## ✅ Constraints  

- `1 ≤ n ≤ 2 × 10⁴`  
- `0 ≤ height[i] ≤ 10⁵`

---

## 💡 Approach  

The key insight: **water above index i** depends on the **tallest bar to its left** and the **tallest bar to its right**.

> `water(i) = min(maxLeft(i), maxRight(i)) – height[i]`

### Steps  

1. **Prefix maximum array `l`** — `l[i]` = tallest bar from `0 … i`.  
2. **Suffix maximum array `r`** — `r[i]` = tallest bar from `i … n‑1`.  
3. Traverse once more:  
   - `ans += min(l[i], r[i]) – height[i]`.

### Why it Works  
`min(l[i], r[i])` is the limiting water level; anything above that spills. If this level is lower than the bar, no water is kept, producing zero or a positive difference.  

---

## 🔍 Complexity Analysis  

|                | Value |
|----------------|-------|
| **Time** | `O(n)` — 3 linear scans |
| **Space** | `O(n)` — two auxiliary arrays (`l`, `r`) |

*(Two‑pointer version achieves `O(1)` space but this prefix‑suffix approach is easier to grasp.)*

---

## 🧪 Quick Test  

```java
public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1})); // 6
    System.out.println(sol.trap(new int[]{4,2,0,3,2,5}));             // 9
}
```

---

## ✨ Possible Improvements  

- **Two‑Pointer Technique (O(1) space):**  
  Maintain `left`, `right`, `leftMax`, `rightMax` pointers; move the smaller side inward each step.
- **Skip Equal Heights:** micro‑optimise by merging flat regions.

---

## 📚 Topics & Hint  

**Topics:** Array • Dynamic Programming • Two Pointers • Stack • Monotonic Stack  

**Hint:**  
> Pre‑compute the highest bar to the *left* and to the *right* of every index. The trapped water at position i is the smaller of those two heights minus the current bar height.