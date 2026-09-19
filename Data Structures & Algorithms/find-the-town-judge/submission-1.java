class Solution {
    public int findJudge(int n, int[][] trust) {
        // TC: O(n + trust.length)
        // SC: O(n)

        int[] cnt = new int[n + 1];

        for (int i = 0; i < trust.length; i++) {
            int a = trust[i][0];
            int b = trust[i][1];

            cnt[a]--;
            cnt[b]++;
        }

        for (int i = 1; i <= n; i++) {
            if (cnt[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}