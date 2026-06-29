class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];

        for (int num = 1; num <= n; num++) {
            int val = num;      
            int x = 0;

            while (val > 0) {
                if (val % 2 == 1) {
                    x++;
                }
                val = val / 2;
            }

            res[num] = x;
        }

        return res;
    }
}