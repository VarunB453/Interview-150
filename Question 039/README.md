# 383. Ransom Note | Java Solution

  


---

🧩 Problem Statement

Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine, and false otherwise.

Each letter in magazine can only be used once in ransomNote.


---

🧠 Examples

Example 1

Example 2

Example 3


---

✅ Constraints

1 <= ransomNote.length, magazine.length <= 10⁵

ransomNote and magazine consist of lowercase English letters only.



---

💡 Approach

✅ Frequency Counting Using Array

1. Use an integer array of size 26 to count character frequencies in magazine.


2. Traverse the ransomNote:

For each character, check if the count is available.

If not, return false.

Otherwise, decrement the count.



3. If all characters are available, return true.



> This is a very efficient solution using constant space for lowercase letters.




---

🔍 Complexity Analysis


---

✅ Java Solution

class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
    int[] count = new int[26];

    for (final char c : magazine.toCharArray())
      ++count[c - 'a'];

    for (final char c : ransomNote.toCharArray()) {
      if (count[c - 'a'] == 0)
        return false;
      --count[c - 'a'];
    }

    return true;
  }
}


---

📚 Topics & Hint

Topics: String, Hashing, Counting

Hint:

> Use a fixed-size array to track character counts in magazine. Decrease the count as you build the ransomNote.



