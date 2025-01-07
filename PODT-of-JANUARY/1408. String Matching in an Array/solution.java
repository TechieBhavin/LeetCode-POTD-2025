// class Solution {
//     public List<String> stringMatching(String[] words) {
//         List<String> result = new ArrayList<>();
//         int n = words.length;
//         for(int i = 0; i < n; i++) {
//             for(int j = 0; j < n; j++) {
//                 if(i != j && words[j].contains(words[i])) {
//                     result.add(words[i]);
//                     break;
//                 }
//             }
//         }
//         return result;
//     }
// }
class Solution {
    public List<String> stringMatching(String[] words) {
        // Sort the strings by their lengths
        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
        ArrayList<String> ans = new ArrayList<>();
        
        // Check each string against the others
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].contains(words[i])) {
                    ans.add(words[i]);
                    break; // Avoid adding duplicates
                }
            }
        }
        
        return ans; // Return the list of substrings
    }
}
