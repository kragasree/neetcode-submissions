class Solution {
    public boolean isHappy(int n) {
        Set<Integer> st = new HashSet<>();

        // if number already seen, exit
        while(!st.contains(n)) {
            st.add(n);
            int ans = 0;
            // find square of that number
            while(n>0) {
                int r = n%10;
                r = r * r;
                ans = ans + r;
                n = n/10;
            }
            n = ans;
            if(n == 1) {
                return true;
            }
        }
        return false;
    }

    //TC:O(log n)
}
