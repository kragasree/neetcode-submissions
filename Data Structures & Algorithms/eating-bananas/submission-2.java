class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // we can use binary search
        // so lets take an exmapl like piles = [3, 6, 7, 11], h= 8
        // here min speed can be 1 and max can be 11
        // we definitely know that for k=11 we will get the correct output. but what we need is the min of them
        // so for k=1, 
            //we need 27 hours, Pile 3  -> 3 hours, Pile 6  -> 6 hours,Pile 7  -> 7 hours, Pile 11 -> 11 hours, total -> 27 hours
        // k = 2
            // we need 15 hours, Pile 3  -> 2 hours, Pile 6  -> 3 hours,Pile 7  -> 4 hours, Pile 11 -> 6 hours, total -> 15 hours
        // k = 3
            // we need 10 hours, Pile 3  -> 1 hours, Pile 6  -> 2 hours,Pile 7  -> 3 hours, Pile 11 -> 4 hours, total -> 10 hours
        // k = 4
            // we need 8 hours, Pile 3  -> 1 hours, Pile 6  -> 2 hours,Pile 7  -> 2 hours, Pile 11 -> 3 hours, total -> 8 hours
        // so the least is k=4. So we need to find this least number. If for k=4 it can eat, then for k=5..11 also it can eat. we need to find this 4 value using binary search

        // we need to do search in max and min ele not on the piles array.

        //TC: O(n)
        int max = piles[0];
        for (int i = 1; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }
        int n = piles.length;
        int low = 1, high = max;
        int k = max;

        //TC: BS(O(nlogn))
        while(low <= high) {
            int mid = low + (high-low)/2;
        
            // Calculate total hours for eating speed = mid
            long totalHours = 0;
            for (int i = 0; i < n; i++) {
                totalHours += (long) Math.ceil((double) piles[i] / mid);
            }

            if (totalHours <= h) {
                k = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return k;

        //TC: O(n) + O(nlogk)
        //SC: O(1)
    }
}
