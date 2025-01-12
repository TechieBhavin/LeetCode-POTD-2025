

<h2><a href="https://leetcode.com/problems/check-if-a-parentheses-string-can-be-valid/?envType=daily-question&envId=2025-01-12">2116. Check if a Parentheses String Can Be Valid
</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr>

<p>A parentheses string is a non-empty string consisting only of '(' and ')'. It is valid if any of the following conditions is true:</p>
<p>It is ().</p>
<p>It can be written as AB (A concatenated with B), where A and B are valid parentheses strings.</p>
<p>It can be written as (A), where A is a valid parentheses string.</p>
<br>
<p>You are given a parentheses string s and a string locked, both of length n. locked is a binary string consisting only of '0's and '1's. For each index i of locked,</p>
<p>If locked[i] is '1', you cannot change s[i].</p>
<p>But if locked[i] is '0', you can change s[i] to either '(' or ')'.</p>
<br>
<p>Return true if you can make s a valid parentheses string. Otherwise, return false.</p>

<b>Examples:</b>

<pre>
<b>Input:</b> s = "))()))", locked = "010100"
<b>Output:</b> true
<b>Explanation:</b> locked[1] == '1' and locked[3] == '1', so we cannot change s[1] or s[3].
We change s[0] and s[4] to '(' while leaving s[2] and s[5] unchanged to make s valid.
</pre>

<pre>
<b>Input:</b> s = "()()", locked = "0000"
<b>Output:</b> true
<b>Explanation:</b> We do not need to make any changes because s is already valid.
</pre>

<pre>
<b>Input:</b> s = ")", locked = "0"
<b>Output:</b> false
<b>Explanation:</b> locked permits us to change s[0]. 
Changing s[0] to either '(' or ')' will not make s valid.
</pre>







