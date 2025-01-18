<h2><a href="https://leetcode.com/problems/minimum-cost-to-make-at-least-one-valid-path-in-a-grid/?envType=daily-question&envId=2025-01-18">1368. Minimum Cost to Make at Least One Valid Path in a Grid
</a></h2> <img src='https://img.shields.io/badge/Difficulty-Hard-red' alt='Difficulty: Hard' /><hr>

<p>Given an m x n grid. Each cell of the grid has a sign pointing to the next cell you should visit if you are currently in this cell. The sign of grid[i][j] can be:</p>
<p>1 which means go to the cell to the right. (i.e go from grid[i][j] to grid[i][j + 1])
</p>
<p>2 which means go to the cell to the left. (i.e go from grid[i][j] to grid[i][j - 1])</p>
<p>3 which means go to the lower cell. (i.e go from grid[i][j] to grid[i + 1][j])</p>
<p>4 which means go to the upper cell. (i.e go from grid[i][j] to grid[i - 1][j])</p><br>
<p>Notice that there could be some signs on the cells of the grid that point outside the grid.</p>
<p>You will initially start at the upper left cell (0, 0). A valid path in the grid is a path that starts from the upper left cell (0, 0) and ends at the bottom-right cell (m - 1, n - 1) following the signs on the grid. The valid path does not have to be the shortest.</p>
<b>Examples:</b>
<p>You can modify the sign on a cell with cost = 1. You can modify the sign on a cell one time only.</p>
<p>Return the minimum cost to make the grid have at least one valid path.</p>


<pre>
<b>Input:</b> grid = [[1,1,1,1],[2,2,2,2],[1,1,1,1],[2,2,2,2]]
<b>Output:</b> 3
<b>Explanation:</b> You will start at point (0, 0).
The path to (3, 3) is as follows. (0, 0) --> (0, 1) --> (0, 2) --> (0, 3) change the arrow to down with cost = 1 --> (1, 3) --> (1, 2) --> (1, 1) --> (1, 0) change the arrow to down with cost = 1 --> (2, 0) --> (2, 1) --> (2, 2) --> (2, 3) change the arrow to down with cost = 1 --> (3, 3)
The total cost = 3.
</pre>

<pre>
<b>Input:</b> grid = [[1,1,3],[3,2,2],[1,1,4]]
<b>Output:</b> 0
<b>Explanation:</b> You can follow the path from (0, 0) to (2, 2).
</pre>

<pre>
<b>Input:</b> arr[] = [1, 2, 3, 4]
<b>Output:</b> 0
<b>Explanation:</b> We cannot trap water as there is no height bound on both sides.
</pre><hr>

<pre>
<b>Input:</b> grid = [[1,2],[4,3]]
<b>Output:</b> 1
</pre><hr>







