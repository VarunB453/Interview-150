# 380. Insert Delete GetRandom O(1) | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-380.%20Insert%20Delete%20GetRandom%20O(1)-blue)](https://leetcode.com/problems/insert-delete-getrandom-o1/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com)
[![Optimal Solution](https://img.shields.io/badge/Solution-Optimal-brightgreen)]()

---

## Problem Statement

Design a data structure that supports all of the following operations **in average O(1) time**:

- `insert(val)`: Inserts an item `val` if it is not already present.
- `remove(val)`: Removes an item `val` if it is present.
- `getRandom()`: Returns a random element from the current set of elements. Each element must have the **same probability** of being returned.

### Example

```text
Input:
["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
[[], [1], [2], [2], [], [1], [2], []]

Output:
[null, true, false, true, 2, true, false, 2]
```

---

## Constraints

- `-2^31 <= val <= 2^31 - 1`
- At most `2 * 10^5` calls will be made to `insert`, `remove`, and `getRandom`.
- There will always be **at least one element** in the set when `getRandom` is called.

---

## Approach

To achieve average `O(1)` time for all operations, we use:

- A `List<Integer>` to store values.
- A `HashMap<Integer, Integer>` to map each value to its index in the list.

### Why This Works:

- **Insert**: Check if value exists using the map. If not, add to end of list and record index in map.
- **Remove**: Swap the value with the last element in the list, update the map, and remove from the list.
- **getRandom**: Use `Random.nextInt(list.size())` to fetch a random element in constant time.

---

## Java Implementation

```java
import java.util.*;

class RandomizedSet {
    private Map<Integer, Integer> valToIndex = new HashMap<>();
    private List<Integer> vals = new ArrayList<>();
    private Random rand = new Random();

    public boolean insert(int val) {
        if (valToIndex.containsKey(val)) return false;
        valToIndex.put(val, vals.size());
        vals.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!valToIndex.containsKey(val)) return false;
        int index = valToIndex.get(val);
        int lastVal = vals.get(vals.size() - 1);
        vals.set(index, lastVal);
        valToIndex.put(lastVal, index);
        vals.remove(vals.size() - 1);
        valToIndex.remove(val);
        return true;
    }

    public int getRandom() {
        int index = rand.nextInt(vals.size());
        return vals.get(index);
    }
}
```

---

## Time & Space Complexity

| Operation    | Time Complexity | Space Complexity |
|--------------|------------------|------------------|
| insert(val)  | O(1)             | O(n)             |
| remove(val)  | O(1)             | O(n)             |
| getRandom()  | O(1)             | O(n)             |

---