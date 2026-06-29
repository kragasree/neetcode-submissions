class Solution {
    public int hammingWeight(int n) {
        int ans  = 0;
        while (n>0) {
            if (n%2 == 1) { 
                ans = ans + 1;
            }
            n = n/2;
        }
        return ans;
    }
}
