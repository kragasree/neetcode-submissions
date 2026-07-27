class Solution {
    public int climbStairs(int n) {
        //fibonnaci series, traverse and see
        // n = 3 -> 3 = ways(2) + ways(1)
        // n = 4 -> ways(3) + ways(2)
        if (n <= 2) {
            return n;
        }

        int ways[] = new int[n+1];
        ways[1] = 1;
        ways[2] = 2;
        for(int i=3; i<=n; i++) {
            ways[i] = ways[i-1] + ways[i-2];
        }

        return ways[n];
    }
}
