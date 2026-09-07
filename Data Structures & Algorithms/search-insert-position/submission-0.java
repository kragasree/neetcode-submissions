class Solution {
    public int searchInsert(int[] nums, int target) {
        //TC: O(logn)
        int l = 0, h = nums.length - 1;
        int pos = nums.length;
        while(l<=h) {
            int m = (l+h)/2;
            if(nums[m] < target) {
                l = m+1;
            } else if (nums[m] > target) {
                pos = m;
                h = m-1;
            } else {
                return m;
            }
        }
        return pos;
    }
}