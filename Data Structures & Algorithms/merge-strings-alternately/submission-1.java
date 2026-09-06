class Solution {
    public String mergeAlternately(String word1, String word2) {
        //use 1 ptr
        //TC: O(n+m)
        int n = word1.length();
        int m = word2.length();
        StringBuilder ans = new StringBuilder();
        int i = 0;

        while(i<n || i<m) {
            if (i < n) {
                ans.append(word1.charAt(i));
            }
            if (i < m) {
                ans.append(word2.charAt(i));
            }
            i++;
        }

        return ans.toString();
    }
}