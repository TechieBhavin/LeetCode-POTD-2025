

<h2><a href="https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/description/?envType=daily-question&envId=2025-01-06">1769. Minimum Number of Operations to Move All Balls to Each Box
</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr>

<p>You have n boxes. You are given a binary string boxes of length n, where boxes[i] is '0' if the ith box is empty, and '1' if it contains one ball.</p>
<p>In one operation, you can move one ball from a box to an adjacent box. Box i is adjacent to box j if abs(i - j) == 1. Note that after doing so, there may be more than one ball in some boxes.</p>
<p>Return an array answer of size n, where answer[i] is the minimum number of operations needed to move all the balls to the ith box.</p>
<p>Each answer[i] is calculated considering the initial state of the boxes.</p>


<b>Examples:</b>

<pre>
<b>Input:</b> boxes = "110"
<b>Output:</b> [1,1,3]
<b>Explanation:</b> The answer for each box is as follows:
1) First box: you will have to move one ball from the second box to the first box in one operation.
2) Second box: you will have to move one ball from the first box to the second box in one operation.
3) Third box: you will have to move one ball from the first box to the third box in two operations, and move one ball from the second box to the third box in one operation.
</pre>

<pre>
<b>Input:</b> boxes = "001011"
<b>Output:</b> [11,8,5,4,3,4]
</pre>






