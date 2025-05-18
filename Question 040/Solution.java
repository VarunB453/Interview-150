public class Solution {
  public boolean isIsomorphic(String s, String t) {
    Map<Character, Integer> A = new HashMap<>();
    Map<Character, Integer> B = new HashMap<>();

    for (Integer i = 0; i < s.length(); ++i)
      if (A.put(s.charAt(i), i) != B.put(t.charAt(i), i))
        return false;
    return true;
  }
}
