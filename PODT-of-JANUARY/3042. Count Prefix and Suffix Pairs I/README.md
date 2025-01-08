
<h2><a href="https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/?envType=daily-question&envId=2025-01-08">3042. Count Prefix and Suffix Pairs I
</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>

<P>You are given a 0-indexed string array words.</P>
<p>Let's define a boolean function isPrefixAndSuffix that takes two strings, str1 and str2:</p>
<P>isPrefixAndSuffix(str1, str2) returns true if str1 is both a prefix and a suffix of str2, and false otherwise.</P>
<p>For example, isPrefixAndSuffix("aba", "ababa") is true because "aba" is a prefix of "ababa" and also a suffix, but isPrefixAndSuffix("abc", "abcd") is false.</p>
<p>Return an integer denoting the number of index pairs (i, j) such that i < j, and isPrefixAndSuffix(words[i], words[j]) is true.</p>


<b>Examples:</b>

<pre>
<b>Input:</b> words = ["a","aba","ababa","aa"]
<b>Output:</b> 4
<b>Explanation:</b> In this example, the counted index pairs are:
i = 0 and j = 1 because isPrefixAndSuffix("a", "aba") is true.
i = 0 and j = 2 because isPrefixAndSuffix("a", "ababa") is true.
i = 0 and j = 3 because isPrefixAndSuffix("a", "aa") is true.
i = 1 and j = 2 because isPrefixAndSuffix("aba", "ababa") is true.
Therefore, the answer is 4.
</pre>

<pre>
<b>Input:</b> words = ["pa","papa","ma","mama"]
<b>Output:</b> 2
<b>Explanation:</b> In this example, the counted index pairs are:
i = 0 and j = 1 because isPrefixAndSuffix("pa", "papa") is true.
i = 2 and j = 3 because isPrefixAndSuffix("ma", "mama") is true.
Therefore, the answer is 2.  
</pre>

<pre>
<b>Input:</b> words = ["abab","ab"]
<b>Output:</b> 0
<b>Explanation:</b> In this example, the only valid index pair is i = 0 and j = 1, and isPrefixAndSuffix("abab", "ab") is false.
Therefore, the answer is 0.
</pre><hr>





