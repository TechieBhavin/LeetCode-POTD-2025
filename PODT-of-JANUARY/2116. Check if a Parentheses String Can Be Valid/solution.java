// class Solution {
//     public boolean canBeValid(String inputString, String lockStatus) {
//         if (inputString.length() % 2 != 0) 
//             return false;

//         int balanceCount = 0;
//         for (int i = 0; i < inputString.length(); i++) {
//             if (lockStatus.charAt(i) == '0' || inputString.charAt(i) == '(') 
//                 balanceCount++;
//             else 
//                 balanceCount--;
//             if (balanceCount < 0) 
//                 return false;
//         }

//         balanceCount = 0;
//         for (int i = inputString.length() - 1; i >= 0; i--) {
//             if (lockStatus.charAt(i) == '0' || inputString.charAt(i) == ')') 
//                 balanceCount++;
//             else 
//                 balanceCount--;
//             if (balanceCount < 0) 
//                 return false;
//         }

//         return true;
//     }
// }
class Solution {
    public boolean canBeValid(String parentheses, String status) {
        int length = parentheses.length();
        if (length % 2 != 0) return false;
        int minBalance = 0, maxBalance = 0;
        for (int i = 0; i < length; i++) {
            boolean isOpening = parentheses.charAt(i) == '(';
            boolean isUnlocked = status.charAt(i) == '0';
            minBalance += (!isOpening || isUnlocked) ? -1 : 1;
            maxBalance += (isOpening || isUnlocked) ? 1 : -1;
            if (maxBalance < 0) return false;
            minBalance = Math.max(minBalance, 0);
        }
        return minBalance == 0;
    }
}
