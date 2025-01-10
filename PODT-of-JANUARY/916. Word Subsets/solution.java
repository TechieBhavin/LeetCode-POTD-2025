import java.util.*;

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreq = new int[26];
        for (String word : words2) {
            int[] freq = new int[26];
            for (char c : word.toCharArray()) freq[c - 'a']++;
            for (int i = 0; i < 26; i++) maxFreq[i] = Math.max(maxFreq[i], freq[i]);
        }

        List<String> result = new ArrayList<>();
        for (String word : words1) {
            int[] freq = new int[26];
            for (char c : word.toCharArray()) freq[c - 'a']++;
            if (isUniversal(freq, maxFreq)) result.add(word);
        }
        return result;
    }

    private boolean isUniversal(int[] wordFreq, int[] maxFreq) {
        for (int i = 0; i < 26; i++) {
            if (wordFreq[i] < maxFreq[i]) return false;
        }
        return true;
    }
}
// class Solution {
//     public List<String> wordSubsets(String[] words1, String[] words2) {
//         int[] req = new int[26];
//         for (String word : words2) {
//             int[] cur = new int[26];
//             for (char c : word.toCharArray()) {
//                 cur[c - 'a']++;
//                 req[c - 'a'] = Math.max(req[c - 'a'], cur[c - 'a']);
//             }
//         }
        
//         List<String> ans = new ArrayList<>();
//         for (String word : words1) {
//             int[] cur = new int[26];
//             for (char c : word.toCharArray()) cur[c - 'a']++;
            
//             boolean isValid = true;
//             for (int i = 0; i < 26; i++) {
//                 if (cur[i] < req[i]) {
//                     isValid = false;
//                     break;
//                 }
//             }
            
//             if (isValid) ans.add(word);
//         }
        
//         return ans;
//     }
// }
