
76. Minimum Window Substring | Java Solution

  


---

🧩 Problem Statement

Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window.
If there is no such substring, return the empty string "".


---

🧠 Examples

Example 1

Explanation:
The smallest substring of s that contains all characters of t is "BANC".


---

Example 2


---

Example 3

Explanation:
t contains two 'a's but s contains only one.


---

✅ Constraints

m == s.length

n == t.length

1 <= m, n <= 10⁵

s and t consist of uppercase and lowercase English letters.



---

💡 Approach

🔄 Sliding Window + Hash Maps

1. Count the frequency of each character in t.


2. Use a sliding window to expand and contract the substring in s:

Expand the window until it contains all characters from t.

Once valid, try to shrink it from the left to find the minimum.



3. Use two hash maps:

One for the required characters.

One for the characters in the current window.




> This is an optimal solution for this type of problem and runs in linear time.




---

🔍 Complexity Analysis


---

✅ Java Solution

class Solution {
  public String minWindow(String s, String t) {
    if (s.length() < t.length()) return "";

    Map<Character, Integer> target = new HashMap<>();
    for (char c : t.toCharArray())
      target.put(c, target.getOrDefault(c, 0) + 1);

    Map<Character, Integer> window = new HashMap<>();
    int have = 0, need = target.size();
    int left = 0, minLen = Integer.MAX_VALUE;
    int start = 0;

    for (int right = 0; right < s.length(); right++) {
      char c = s.charAt(right);
      window.put(c, window.getOrDefault(c, 0) + 1);

      if (target.containsKey(c) && window.get(c).intValue() == target.get(c).intValue()) {
        have++;
      }

      while (have == need) {
        if (right - left + 1 < minLen) {
          minLen = right - left + 1;
          start = left;
        }

        char leftChar = s.charAt(left);
        window.put(leftChar, window.get(leftChar) - 1);
        if (target.containsKey(leftChar) && window.get(leftChar) < target.get(leftChar)) {
          have--;
        }
        left++;
      }
    }

    return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
  }
}


---

📚 Topics & Hint

Topics: Hash Table, Two Pointers, Sliding Window, String

Hint:

> Use two hash maps and two pointers to efficiently slide the window and track when all characters are matched.
