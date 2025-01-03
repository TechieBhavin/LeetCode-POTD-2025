
<h2><a href="https://leetcode.com/problems/maximum-score-after-splitting-a-string/description/?envType=daily-question&envId=2025-01-01">1422. Maximum Score After Splitting a String
</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>

<p>Given a string s of zeros and ones, return the maximum score after splitting the string into two non-empty substrings (i.e. left substring and right substring).</p>
<P>The score after splitting a string is the number of zeros in the left substring plus the number of ones in the right substring.</P>


<b>Examples:</b>

<pre>
<b>Input:</b> s = "011101"
<b>Output:</b> 5
<b>Explanation:</b> All possible ways of splitting s into two non-empty substrings are:
left = "0" and right = "11101", score = 1 + 4 = 5 
left = "01" and right = "1101", score = 1 + 3 = 4 
left = "011" and right = "101", score = 1 + 2 = 3 
left = "0111" and right = "01", score = 1 + 1 = 2 
left = "01110" and right = "1", score = 2 + 1 = 3
</pre>

<pre>
<b>Input:</b> s = "00111"
<b>Output:</b> 5
<b>Explanation:</b> When left = "00" and right = "111", we get the maximum score = 2 + 3 = 5
</pre>

<pre>
<b>Input:</b> s = "1111"
<b>Output:</b> 3
</pre><hr>





