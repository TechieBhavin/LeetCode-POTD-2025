
<h2><a href= "https://leetcode.com/problems/minimize-xor/?envType=daily-question&envId=2025-01-15">2429. Minimize XOR
</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr>

<p>Given two positive integers num1 and num2, find the positive integer x such that:</p>
<p>x has the same number of set bits as num2, and</p>
<p>The value x XOR num1 is minimal.</p><br>
<p>Note that XOR is the bitwise XOR operation.</p>
<p>Return the integer x. The test cases are generated such that x is uniquely determined.</p>
<p>The number of set bits of an integer is the number of 1's in its binary representation.</p>

<b>Examples:</b>

<pre>
<b>Input:</b> num1 = 3, num2 = 5
<b>Output:</b> 3
<b>Explanation:</b> The binary representations of num1 and num2 are 0011 and 0101, respectively.
The integer 3 has the same number of set bits as num2, and the value 3 XOR 3 = 0 is minimal.
</pre>

<pre>
<b>Input:</b> num1 = 1, num2 = 12
<b>Output:</b> 3
<b>Explanation:</b> The binary representations of num1 and num2 are 0001 and 1100, respectively.
The integer 3 has the same number of set bits as num2, and the value 3 XOR 1 = 2 is minimal.
</pre>







