class Solution {
    public String mergeAlternately(String word1, String word2) {
        //TC: O(n + m)
        int n = word1.length();
        int m = word2.length();

        StringBuilder ans = new StringBuilder();

        int i = 0, j = 0;
        while(i<n && j<m) {
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(j));
            i++;
            j++;
        }

        if(i<n) {
            for(int k=i; k<n; k++) {
                ans.append(word1.charAt(k));
            }
        }

        if(j<m) {
            for(int k=j; k<m; k++) {
                ans.append(word2.charAt(k));
            }
        }

        return ans.toString();
    }
}