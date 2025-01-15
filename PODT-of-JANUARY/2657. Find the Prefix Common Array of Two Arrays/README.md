
<h2><a href="https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/?envType=daily-question&envId=2025-01-14">2657. Find the Prefix Common Array of Two Arrays

</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr>

<p>You are given two 0-indexed integer permutations A and B of length n.</p>
<p>A prefix common array of A and B is an array C such that C[i] is equal to the count of numbers that are present at or before the index i in both A and B.</p>
<p>Return the prefix common array of A and B.</p>
<p>A sequence of n integers is called a permutation if it contains all integers from 1 to n exactly once.</p>


<b>Examples:</b>

<pre>
<b>Input:</b> A = [1,3,2,4], B = [3,1,2,4]
<b>Output:</b> [0,2,3,4]
<b>Explanation:</b> At i = 0: no number is common, so C[0] = 0.
At i = 1: 1 and 3 are common in A and B, so C[1] = 2.
At i = 2: 1, 2, and 3 are common in A and B, so C[2] = 3.
At i = 3: 1, 2, 3, and 4 are common in A and B, so C[3] = 4.
</pre>

<pre>
<b>Input:</b> A = [2,3,1], B = [3,1,2]
<b>Output:</b> [0,1,3]
<b>Explanation:</b> At i = 0: no number is common, so C[0] = 0.
At i = 1: only 3 is common in A and B, so C[1] = 1.
At i = 2: 1, 2, and 3 are common in A and B, so C[2] = 3.
</pre>








