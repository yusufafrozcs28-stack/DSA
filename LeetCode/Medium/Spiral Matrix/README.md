# Spiral Matrix

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **Language** | java |
| **Solved On** | August 20, 2026 |
| **Link** | [View Problem](https://leetcode.com/problems/spiral-matrix/) |
| **Runtime** | 0 ms |
| **Memory** | 42.8 MB |

##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: Super Simple and Easy to Understand Solution
**Author**: [@qwl5004](https://leetcode.com/qwl5004/)
**Upvotes**: 1542 👍
**Link**: [View Original Post](https://leetcode.com/problems/spiral-matrix/solutions/20599/)

---

This is a very simple and easy to understand solution. I traverse right and increment rowBegin, then traverse down and decrement colEnd, then I traverse left and decrement rowEnd, and finally I traverse up and increment colBegin.

The only tricky part is that when I traverse left or up I have to check whether the row or col still exists to prevent duplicates. If anyone can do the same thing without that check, please let me know!

Any comments greatly appreciated.

    public class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            
            List<Integer> res = new ArrayList<Integer>();
            
            if (matrix.length == 0) {
                return res;
            }
            
            int rowBegin = 0;
            int rowEnd = matrix.length-1;
            int colBegin = 0;
            int colEnd = matrix[0].length - 1;
            
            while (rowBegin <= rowEnd && colBegin <= colEnd) {
                // Traverse Right
                for (int j = colBegin; j <= colEnd; j ++) {
                    res.add(matrix[rowBegin][j]);
                }
                rowBegin++;
                
                // Traverse Down
                for (int j = rowBegin; j <= rowEnd; j ++) {
                    res.add(matrix[j][colEnd]);
                }
                colEnd--;
                
                if (rowBegin <= rowEnd) {
                    // Traverse Left
                    for (int j = colEnd; j >= colBegin; j --) {
                        res.add(matrix[rowEnd][j]);
                    }
                }
                rowEnd--;
                
                if (colBegin <= colEnd) {
                    // Traver Up
                    for (int j = rowEnd; j >= rowBegin; j --) {
                        res.add(matrix[j][colBegin]);
                    }
                }
                colBegin ++;
            }
            
            return res;
        }
    }

</details>
