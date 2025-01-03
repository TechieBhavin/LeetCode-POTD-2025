class Solution {
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private boolean isVowelString(String s){
        return isVowel(s.charAt(0)) && isVowel(s.charAt(s.length()-1));
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] prefix = new int[words.length + 1];
        int i = 0;
        for (String s : words) {
            if (isVowelString(s))
                prefix[i + 1] = prefix[i] + 1;

            else
                prefix[i + 1] = prefix[i];

            i++;
        }

        int[] ans = new int[queries.length];
        int j = 0;
        for (int q[] : queries) {
            int r = q[1];
            int l = q[0];

            ans[j++] = prefix[r + 1] - prefix[l];
        }

        return ans;
    }
}
