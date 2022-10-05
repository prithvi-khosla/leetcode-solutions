class Solution {
    public boolean isPalindrome(String s) {
        String str = (s.replaceAll("[^a-zA-Z0-9]", "")).toLowerCase();

        if(str.length() == 0 || str.length() == 1) {
            return true;
        }

        int leftIndex = 0, rightIndex = str.length() - 1;

        while (leftIndex < rightIndex) {
            if(str.charAt(leftIndex) != str.charAt(rightIndex)) return false;

            leftIndex++;
            rightIndex--;
        }

        return true;
    
    }
}