class Solution {
    public int findMin(int[] nums) {
        int l = 0, h = nums.length - 1;
        int min = Integer.MAX_VALUE;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (nums[m] < min) {
                min = nums[m];
            } else if (nums[m] > nums[h]) {
                l = m + 1;
            } else {
                h = m-1;
            }
        }
        return min;
    }
}
