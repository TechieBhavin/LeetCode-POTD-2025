
<h2><a href= "https://leetcode.com/problems/shifting-letters-ii/?envType=daily-question&envId=2025-01-05">2381. Shifting Letters II
</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr>

<p>You are given a string s of lowercase English letters and a 2D integer array shifts where shifts[i] = [starti, endi, directioni]. For every i, shift the characters in s from the index starti to the index endi (inclusive) forward if directioni = 1, or shift the characters backward if directioni = 0.</p>
<p>Shifting a character forward means replacing it with the next letter in the alphabet (wrapping around so that 'z' becomes 'a'). Similarly, shifting a character backward means replacing it with the previous letter in the alphabet (wrapping around so that 'a' becomes 'z').</p>
<p>Return the final string after all such shifts to s are applied.</p>


<b>Examples:</b>

<pre>
<b>Input:</b> s = "abc", shifts = [[0,1,0],[1,2,1],[0,2,1]]
<b>Output:</b> "ace"
<b>Explanation:</b> Firstly, shift the characters from index 0 to index 1 backward. Now s = "zac".
Secondly, shift the characters from index 1 to index 2 forward. Now s = "zbd".
Finally, shift the characters from index 0 to index 2 forward. Now s = "ace".
</pre>

<pre>
<b>Input:</b> s = "dztz", shifts = [[0,0,0],[1,1,1]]
<b>Output:</b> "catz"
<b>Explanation:</b> Firstly, shift the characters from index 0 to index 0 backward. Now s = "cztz".
Finally, shift the characters from index 1 to index 1 forward. Now s = "catz".
</pre>

<pre>
<b>Input:</b> s = "bbcbaba"
<b>Output:</b> 4
<b>Explanation:</b> The 4 palindromic subsequences of length 3 are:
- "bbb" (subsequence of "bbcbaba")
- "bcb" (subsequence of "bbcbaba")
- "bab" (subsequence of "bbcbaba")
- "aba" (subsequence of "bbcbaba")
</pre><hr>





