class Solution {
    public int characterReplacement(String s, int k) {

        // TC: O(26 * n) = O(n) since there are only 26 uppercase letters
        // SC: O(26)

        int maxLength = 0;

        // Store all distinct characters present in the string
        HashSet<Character> uniqueChars = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            uniqueChars.add(s.charAt(i));
        }

        // Consider each character as the one we want the entire window to become
        for (char ch : uniqueChars) {

            int left = 0;
            int count = 0;

            for (int right = 0; right < s.length(); right++) {

                // Count how many times our chosen character appears
                if (s.charAt(right) == ch) {
                    count++;
                }

                // If replacements needed exceed k, shrink the window
                while ((right - left + 1) - count > k) {

                    if (s.charAt(left) == ch) {
                        count--;
                    }

                    left++;
                }

                // Update max
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        return maxLength;
    }
}