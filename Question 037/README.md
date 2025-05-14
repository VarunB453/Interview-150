
# 73. Set Matrix Zeroes — Sprinkle Some ✨Zero Magic✨

Welcome to the adventure of LeetCode 73: Set Matrix Zeroes — where every 0 you find becomes a powerful spell that zeroes out its entire row and column!
But here’s the challenge: can you do it in-place with O(1) space? Spoiler alert: You totally can!

Let’s dive into the zero magic together!


---

The Mission

Given a 2D matrix, if any cell contains a 0, you must set its entire row and column to zero — in-place!
No extra storage spells allowed — just your wit and the matrix itself!


---

The Game Plan

1. Scout the Borders

Check if the first row or first column need to be zeroed later

Use two Boolean flags: shouldFillFirstRow & shouldFillFirstCol

Think of them as your matrix guardians

🧭



2. Mark the Battlefield

For every 0 found (except in the first row/col), mark its row and column in the first row and column

This is your battle strategy map

🗺️



3. Unleash the Zero Spell

Using the markers, set the appropriate cells to 0

Spread the magic

✨



4. Honor the Guardians

If the first row/column were marked, zero them out too

They started it all — give them credit!

⚔️

---

Why This Rocks

In-place magic? ✔️

Constant space? ✔️

Elegant & powerful? Absolutely ✔️

Matrix zeroification wizardry? Oh yeah! ✨



