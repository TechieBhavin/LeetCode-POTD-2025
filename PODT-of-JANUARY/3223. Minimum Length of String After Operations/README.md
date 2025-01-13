
<h2><a href="https://leetcode.com/problems/minimum-length-of-string-after-operations/?envType=daily-question&envId=2025-01-13">3223. Minimum Length of String After Operations
</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr>

<p>You are given a string s.</p>
<p>You can perform the following process on s any number of times:</p>
<p>Choose an index i in the string such that there is at least one character to the left of index i that is equal to s[i], and at least one character to the right that is also equal to s[i].</p>
<p>Delete the closest character to the left of index i that is equal to s[i].</p>
<p>Delete the closest character to the right of index i that is equal to s[i].</p>
<p>Return the minimum length of the final string s that you can achieve.</p>


<b>Examples:</b>

<pre>
<b>Input:</b> s = "abaacbcbb"
<b>Output:</b> 5
<b>Explanation:</b> We do the following operations:
Choose index 2, then remove the characters at indices 0 and 3. The resulting string is s = "bacbcbb".
Choose index 3, then remove the characters at indices 0 and 5. The resulting string is s = "acbcb".
</pre>

<pre>
<b>Input:</b> s = "aa"
<b>Output:</b> 2
<b>Explanation:</b> We cannot perform any operations, so we return the length of the original string.
</pre>









