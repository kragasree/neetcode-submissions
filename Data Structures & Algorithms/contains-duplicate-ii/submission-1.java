public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //TC: O(n^2)
        for (int p1 = 0; p1 < nums.length; p1++) {
            for (int p2 = p1 + 1; p2 < Math.min(nums.length, p1 + k + 1); p2++) {
                if (nums[p1] == nums[p2]) {
                    return true;
                }
            }
        }
        return false;
    }
}