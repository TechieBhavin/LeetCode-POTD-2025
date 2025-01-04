
<h2><a href="https://leetcode.com/problems/unique-length-3-palindromic-subsequences/description/?envType=daily-question&envId=2025-01-04">1930. Unique Length-3 Palindromic Subsequences
</a></h2> <img src='https://img.shields.io/badge/Difficulty-medium-Orange' alt='Difficulty: Medium' /><hr>

<p>Given a string s, return the number of unique palindromes of length three that are a subsequence of s.</p>
<P>Note that even if there are multiple ways to obtain the same subsequence, it is still only counted once.</P>
<p>A palindrome is a string that reads the same forwards and backwards.</p>
<p>A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.</p>
<p>For example, "ace" is a subsequence of "abcde".</p>


<b>Examples:</b>

<pre>
<b>Input:</b> s = "aabca"
<b>Output:</b> 3
<b>Explanation:</b> The 3 palindromic subsequences of length 3 are:
- "aba" (subsequence of "aabca")
- "aaa" (subsequence of "aabca")
- "aca" (subsequence of "aabca")
</pre>

<pre>
<b>Input:</b> s = "adc"
<b>Output:</b> 0
<b>Explanation:</b> There are no palindromic subsequences of length 3 in "adc".
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





