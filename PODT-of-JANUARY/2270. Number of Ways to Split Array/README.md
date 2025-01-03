
<h2><a href="https://leetcode.com/problems/count-vowel-strings-in-ranges/description/?envType=daily-question&envId=2025-01-02">2559. Count Vowel Strings in Ranges
</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr>

<p>You are given a 0-indexed array of strings words and a 2D array of integers queries.</p>
<P>Each query queries[i] = [li, ri] asks us to find the number of strings present in the range li to ri (both inclusive) of words that start and end with a vowel.</P>
<p>Return an array ans of size queries.length, where ans[i] is the answer to the ith query.</p>
<b>Note</b><p>that the vowel letters are 'a', 'e', 'i', 'o', and 'u'.</p>


<b>Examples:</b>

<pre>
<b>Input:</b> words = ["aba","bcb","ece","aa","e"], queries = [[0,2],[1,4],[1,1]]
<b>Output:</b> [2,3,0]
<b>Explanation:</b> The strings starting and ending with a vowel are "aba", "ece", "aa" and "e".
The answer to the query [0,2] is 2 (strings "aba" and "ece").
to query [1,4] is 3 (strings "ece", "aa", "e").
to query [1,1] is 0.
We return [2,3,0].
</pre>

<pre>
<b>Input:</b> words = ["a","e","i"], queries = [[0,2],[0,1],[2,2]]
<b>Output:</b> [3,2,1]
<b>Explanation:</b> Every string satisfies the conditions, so we return [3,2,1].
</pre>






