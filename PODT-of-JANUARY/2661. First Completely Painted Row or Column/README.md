
<h2><a href="https://leetcode.com/problems/first-completely-painted-row-or-column/?envType=daily-question&envId=2025-01-20">2661. First Completely Painted Row or Column

</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr>

<p>You are given a 0-indexed integer array arr, and an m x n integer matrix mat. arr and mat both contain all the integers in the range [1, m * n].</p>
<p>Go through each index i in arr starting from index 0 and paint the cell in mat containing the integer arr[i].</p>
<p>Return the smallest index i at which either a row or a column will be completely painted in mat.</p>


<b>Examples:</b>

<pre>
<b>Input:</b> arr = [1,3,4,2], mat = [[1,4],[2,3]]
<b>Output:</b> 2
<b>Explanation:</b> The moves are shown in order, and both the first row and second column of the matrix become fully painted at arr[2].
</pre>

<pre>
<b>Input:</b> arr = [2,8,7,4,1,3,5,6,9], mat = [[3,2,5],[1,4,6],[8,7,9]]
<b>Output:</b> 3
<b>Explanation:</b> The second column becomes fully painted at arr[3].
</pre>









