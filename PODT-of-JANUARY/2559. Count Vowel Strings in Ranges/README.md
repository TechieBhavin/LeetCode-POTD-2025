
<h2><a href="https://leetcode.com/problems/number-of-ways-to-split-array/description/?envType=daily-question&envId=2025-01-03">2270. Number of Ways to Split Array
</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr>

<p>You are given a 0-indexed integer array nums of length n.</p>
<P>nums contains a valid split at index i if the following are true:</P>
<p>(i)The sum of the first i + 1 elements is greater than or equal to the sum of the last n - i - 1 elements.</p>
<p>(ii)There is at least one element to the right of i. That is, 0 <= i < n - 1.</p>
<p>Return the number of valid splits in nums.</p>


<b>Examples:</b>

<pre>
<b>Input:</b> nums = [10,4,-8,7]
<b>Output:</b> 2
<b>Explanation:</b> There are three ways of splitting nums into two non-empty parts:
- Split nums at index 0. Then, the first part is [10], and its sum is 10. The second part is [4,-8,7], and its sum is 3. Since 10 >= 3, i = 0 is a valid split.
- Split nums at index 1. Then, the first part is [10,4], and its sum is 14. The second part is [-8,7], and its sum is -1. Since 14 >= -1, i = 1 is a valid split.
- Split nums at index 2. Then, the first part is [10,4,-8], and its sum is 6. The second part is [7], and its sum is 7. Since 6 < 7, i = 2 is not a valid split.
Thus, the number of valid splits in nums is 2.
</pre>

<pre>
<b>Input:</b> nums = [2,3,1,0]
<b>Output:</b> 2
<b>Explanation:</b> There are two valid splits in nums:
- Split nums at index 1. Then, the first part is [2,3], and its sum is 5. The second part is [1,0], and its sum is 1. Since 5 >= 1, i = 1 is a valid split. 
- Split nums at index 2. Then, the first part is [2,3,1], and its sum is 6. The second part is [0], and its sum is 0. Since 6 >= 0, i = 2 is a valid split.
</pre>






