# 🚀 LeetCode Top Interview 150 - 150-Day Challenge

**Goal:** Solve **1 problem daily** from the [LeetCode Top Interview 150](https://leetcode.com/studyplan/top-interview-150/) list to master coding interview patterns.

---

## 📌 Challenge Overview

| Metric            | Value         |
| ----------------- | ------------- |
| 🧠 Total Problems | 150           |
| 🎯 Daily Target   | 1 problem/day |
| 🗓️ Timeframe     | 150 days      |

---

## 📊 Progress Tracker

✅ **Solved:** **43/150** (29%)

⏳ **Remaining:** **107/150**

📅 **Current Streak:** **43 days**

---

## 📅 Daily Log

| Day | Problem No.                                                                                                                                 | Difficulty | Solution                                                                                  | Approach                                  | Time/Space               |
| --- | ------------------------------------------------------------------------------------------------------------------------------------------- | ---------- | ----------------------------------------------------------------------------------------- | ----------------------------------------- | ------------------------ |
| 1   | [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)                                                                 | Easy       | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20001/Solution.java) | Three‑pointer reverse merge               | O(m+n) / O(1)            |
| 2   | [27. Remove Element](https://leetcode.com/problems/remove-element/)                                                                         | Easy       | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20002/Solution.java) | Forward overwrite valid elements          | O(n) / O(1)              |
| 3   | [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)                               | Easy       | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20003/Solution.java) | Two‑pointer overwrite unique values       | O(n) / O(1)              |
| 4   | [80. Remove Duplicates from Sorted Array II](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)                         | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20004/Solution.java) | Two‑pointer limit to 2 occurrences        | O(n) / O(1)              |
| 5   | [169. Majority Element](https://leetcode.com/problems/majority-element/)                                                                    | Easy       | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20005/Solution.java) | Boyer‑Moore Voting Algorithm              | O(n) / O(1)              |
| 6   | [189. Rotate Array](https://leetcode.com/problems/rotate-array/)                                                                            | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20006/Solution.java) | Reverse entire + parts to rotate          | O(n) / O(1)              |
| 7   | [121. Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)                                      | Easy       | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20007/Solution.java) | Track min price + max profit              | O(n) / O(1)              |
| 8   | [122. Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/)                                | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20008/Solution.java) | Greedy or DP (buy low, sell high)         | O(n) / O(1) or O(n)      |
| 9   | [55. Jump Game](https://leetcode.com/problems/jump-game/)                                                                                   | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20009/Solution.java) | Greedy (max reachable index)              | O(n) / O(1)              |
| 10  | [45. Jump Game II](https://leetcode.com/problems/jump-game-ii/)                                                                             | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20010/Solution.java) | Greedy (range end triggers jump)          | O(n) / O(1)              |
| 11  | [274. H-Index](https://leetcode.com/problems/h-index/)                                                                                      | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20011/Solution.java) | Sort & binary search                      | O(n log n) / O(1)        |
| 12  | [380. Insert Delete GetRandom O(1)](https://leetcode.com/problems/insert-delete-getrandom-o1/)                                              | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20012/Solution.java) | HashMap + ArrayList                       | O(1) avg / O(n)          |
| 13  | [238. Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)                                            | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20013/Solution.java) | Prefix × suffix pass                      | O(n) / O(1)              |
| 14  | [134. Gas Station](https://leetcode.com/problems/gas-station/)                                                                              | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20014/Solution.java) | Greedy reset when tank < 0                | O(n) / O(1)              |
| 15  | [135. Candy](https://leetcode.com/problems/candy/)                                                                                          | Hard       | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20015/Solution.java) | Two‑pass greedy on ratings                | O(n) / O(n)              |
| 16  | [42. Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/)                                                               | Hard       | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20016/Solution.java) | Prefix‑suffix max arrays (or two‑pointer) | O(n) / O(n)              |
| 17  | [13. Roman to Integer](https://leetcode.com/problems/roman-to-integer/)                                                                     | Easy       | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20017/Solution.java) | Right-to-left subtraction logic           | O(n) / O(1)              |
| 18  | [12. Integer to Roman](https://leetcode.com/problems/integer-to-roman/)                                                                     | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20018/Solution.java) | Greedy subtract + symbol map              | O(1) / O(1)              |
| 19  | [58. Length of Last Word](https://leetcode.com/problems/length-of-last-word/)                                                               | Easy       | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20019/Solution.java) | Reverse scan + skip spaces                | O(n) / O(1)              |
| 20  | [14. Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/)                                                           | Easy       | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20020/Solution.java) | Vertical scan                             | O(m\*n) / O(1)           |
| 21  | [151. Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/)                                                  | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20021/Solution.java) | Two-pointer reverse traversal + trimming  | O(n) / O(n)              |
| 22  | [6. Zigzag Conversion](https://leetcode.com/problems/zigzag-conversion/)                                                                    | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20022/Solution.java) | Simulate zigzag filling rows              | O(n) / O(n)              |
| 23  | [28. Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) | Easy       | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20023/Solution.java) | Java `indexOf()` or manual match          | O(n \* m) / O(1)         |
| 24  | [68. Text Justification](https://leetcode.com/problems/text-justification/)                                                                 | Hard       | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20024/Solution.java) | Greedy line packing + space distribution  | O(n) / O(1)              |
| 25  | [125. Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)                                                                    | Easy       | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20025/Solution.java) | Two-pointer with character filtering      | O(n) / O(1)              |
| 26  | [392. Is Subsequence](https://leetcode.com/problems/is-subsequence/)                                                                        | Easy       | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20026/Solution.java) | Two-pointer character match               | O(n) / O(1)              |
| 27  | [167. Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)                                  | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20027/Solution.java) | Two-pointer from both ends                | O(n) / O(1)              |
| 28  | [11. Container With Most Water](https://leetcode.com/problems/container-with-most-water/)                                                   | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20028/Solution.java) | Two-pointer maximize area                 | O(n) / O(1)              |
| 29  | [15. 3Sum](https://leetcode.com/problems/3sum/)                                                                                             | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20029/Solution.java) | Sort + Two-pointer + Skip duplicates      | O(n²) / O(log n) or O(n) |
| 30  | [209. Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/)                                                 | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20030/Solution.java) | Sliding window (expand/shrink window)     | O(n) / O(1)              |
| 31  | [3. Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20031/Solution.java) | Sliding window + HashSet                  | O(n) / O(min(n, m))      |
| 32  | [30. Substring with Concatenation of All Words](https://leetcode.com/problems/substring-with-concatenation-of-all-words/) | Hard       | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20032/Solution.java) | Sliding window with hashmap               | O(n * k) / O(n + k)      |
| 33  | [76. Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/)                                     | Hard       | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20033/Solution.java) | Sliding window + counter map              | O(n) / O(k)              |
| 34  | [36. Valid Sudoku](https://leetcode.com/problems/valid-sudoku/)                                                             | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20034/Solution.java) | Set validation per row/col/box            | O(1) / O(1)              |
| 35  | [54. Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)                                                           | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20035/Solution.java) | Layer-by-layer traversal                   | O(m*n) / O(1)            |
| 36  | [48. Rotate Image](https://leetcode.com/problems/rotate-image/)                                                             | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20036/Solution.java) | Transpose + reverse rows                   | O(n²) / O(1)             |
| 37  | [73. Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/)                                                   | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20037/Solution.java) | Mark first row/col as zero flags           | O(m*n) / O(1)            |
| 38  | [289. Game of Life](https://leetcode.com/problems/game-of-life/)                                                            | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20038/Solution.java) | In-place state encoding                    | O(m*n) / O(1)            |
| 39  | [383. Ransom Note](https://leetcode.com/problems/ransom-note/)                                                              | Easy       | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20039/Solution.java) | Char count comparison                      | O(n) / O(1)              |
| 40  | [205. Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings/)                                                | Easy       | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20040/Solution.java) | HashMap mapping both directions            | O(n) / O(1)              |
| 41  | [290. Word Pattern](https://leetcode.com/problems/word-pattern/)                                                            | Easy       | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20041/Solution.java) | HashMap + split and compare                | O(n) / O(1)              |
| 42  | [242. Valid Anagram](https://leetcode.com/problems/valid-anagram/)                                                          | Easy       | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20042/Solution.java) | Count chars with array                     | O(n) / O(1)              |
| 43  | [49. Group Anagrams](https://leetcode.com/problems/group-anagrams/)                                                         | Medium     | [Code](https://github.com/VarunB453/Interview-150/blob/main/Question%20043/Solution.java) | HashMap with sorted key or char count      | O(n k log k) / O(n k)    |


---

## 📈 Progress Visualization

```plaintext
Progress: 🟩🟩🟩🟩 (43/150)

```

---

## 🛠 How to Use This Repo

* 📁 Each problem has its **own folder**: `Question {Day}/Solution.java`
* 🧠 Includes **commented explanations** and **efficient approaches**
* 🔄 Solutions use Java, with consistent formatting and naming

---

## 🌟 Upcoming Goals

* ✅ Reach 30 problems by the end of the month
* 📦 Add unit tests for each Java file
* 🔁 Revisit and optimize any early solutions if needed

---
