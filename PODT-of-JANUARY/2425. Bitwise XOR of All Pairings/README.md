

<h2><a href="https://leetcode.com/problems/bitwise-xor-of-all-pairings/?envType=daily-question&envId=2025-01-16">425. Bitwise XOR of All Pairings
</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr>

<p>You are given two 0-indexed arrays, nums1 and nums2, consisting of non-negative integers. There exists another array, nums3, which contains the bitwise XOR of all pairings of integers between nums1 and nums2 (every integer in nums1 is paired with every integer in nums2 exactly once).</p>
<p>Return the bitwise XOR of all integers in nums3.</p>

<b>Examples:</b>

<pre>
<b>Input:</b> nums1 = [2,1,3], nums2 = [10,2,5,0]
<b>Output:</b> 13
<b>Explanation:</b> A possible nums3 array is [8,0,7,2,11,3,4,1,9,1,6,3].
The bitwise XOR of all these numbers is 13, so we return 13.
</pre>

<pre>
<b>Input:</b> nums1 = [1,2], nums2 = [3,4]
<b>Output:</b> 0
<b>Explanation:</b> All possible pairs of bitwise XORs are nums1[0] ^ nums2[0], nums1[0] ^ nums2[1], nums1[1] ^ nums2[0],
and nums1[1] ^ nums2[1].
Thus, one possible nums3 array is [2,5,1,6].
2 ^ 5 ^ 1 ^ 6 = 0, so we return 0.
</pre>








