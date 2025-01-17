
<h2><a href="https://leetcode.com/problems/neighboring-bitwise-xor/?envType=daily-question&envId=2025-01-17">2683. Neighboring Bitwise XOR

</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr>

<p>A 0-indexed array derived with length n is derived by computing the bitwise XOR (⊕) of adjacent values in a binary array original of length n.</p>
<p>Specifically, for each index i in the range [0, n - 1]:</p>
<p>If i = n - 1, then derived[i] = original[i] ⊕ original[0].</p>
<p>Otherwise, derived[i] = original[i] ⊕ original[i + 1].</p><br>
<p>Given an array derived, your task is to determine whether there exists a valid binary array original that could have formed derived.</p>
<p>Return true if such an array exists or false otherwise.</p>
<p>A binary array is an array containing only 0's and 1's</p>

<b>Examples:</b>

<pre>
<b>Input:</b> derived = [1,1,0]
<b>Output:</b> True
<b>Explanation:</b> A valid original array that gives derived is [0,1,0].
derived[0] = original[0] ⊕ original[1] = 0 ⊕ 1 = 1 
derived[1] = original[1] ⊕ original[2] = 1 ⊕ 0 = 1
derived[2] = original[2] ⊕ original[0] = 0 ⊕ 0 = 0
</pre>

<pre>
<b>Input:</b> derived = [1,1]
<b>Output:</b> True
<b>Explanation:</b> A valid original array that gives derived is [0,1].
derived[0] = original[0] ⊕ original[1] = 1
derived[1] = original[1] ⊕ original[0] = 1
</pre>

<pre>
<b>Input:</b> derived = [1,0]
<b>Output:</b> False
<b>Explanation:</b> There is no valid original array that gives derived.
</pre>









