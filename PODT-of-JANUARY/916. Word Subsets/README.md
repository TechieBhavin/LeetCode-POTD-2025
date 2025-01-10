
<h2><a href="https://leetcode.com/problems/word-subsets/?envType=daily-question&envId=2025-01-10">916. Word Subsets
</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr>

<p>You are given two string arrays words1 and words2.</p>
<p>A string b is a subset of string a if every letter in b occurs in a including multiplicity.</p>
<p>For example, "wrr" is a subset of "warrior" but is not a subset of "world".</p>
<p>A string a from words1 is universal if for every string b in words2, b is a subset of a.</p>
<p>Return an array of all the universal strings in words1. You may return the answer in any order.</p>

<b>Examples:</b>

<pre>
<b>Input:</b> words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["e","o"]
<b>Output:</b> ["facebook","google","leetcode"]
</pre>

<pre>
<b>Input:</b> words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["l","e"]
<b>Output:</b> ["apple","google","leetcode"]
</pre>








