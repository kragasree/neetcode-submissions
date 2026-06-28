class Solution {
    public boolean isHappy(int n) {
        // using fast and slow ptrs method, how we detect cycle in a LL
        int slow = n;
        int fast = square(n);

        while(slow != fast) {
            fast = square(fast);
            fast = square(fast);
            slow = square(slow);
        }

        if(fast == 1) {
            return true;
        }

        return false;
        
    }

    private int square(int n) {
        int ans = 0;
        while(n > 0) {
            int r = n%10;
            r = r * r;
            ans = ans + r;
            n = n/10;
        }
        return ans;
    }

    //TC: O(log n)
}
