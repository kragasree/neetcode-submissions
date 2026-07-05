class Solution {
    public int longestConsecutive(int[] nums) {
        int p1 = 1;
        
        if (nums.length == 0)
            return 0;

        int max = 1;
        int currLen = 1;
        Arrays.sort(nums);
        while (p1 < nums.length) {

            if (nums[p1] - nums[p1 - 1] == 1) {
                currLen++;
                p1++;
            } else if (nums[p1] == nums[p1 - 1]) {
                p1++;
            } else {
                max = Math.max(max, currLen);
                currLen = 1;
                p1++;
            }
        }

        max = Math.max(max, currLen);
        return max;
    }
}
