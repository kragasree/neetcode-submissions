class Solution {
    public int findJudge(int n, int[][] trust) {
        //TC: O(n + trust.length)
        //SC: O(2n)
        int[] cntA = new int[n + 1];
        int[] cntB = new int[n + 1];

        for (int i = 0; i < trust.length; i++) {
            int a = trust[i][0];
            int b = trust[i][1];

            cntA[a]++;
            cntB[b]++;
        }

        for (int i = 1; i <= n; i++) {
            if (cntB[i] == n - 1 && cntA[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}