public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int max = 0, maxCount = 0;
        int n = nums.length;

        for (int i=0; i<n; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            if (count.get(nums[i]) > maxCount) {
                max = nums[i];
                maxCount = count.get(nums[i]);
            }
        }
        return max;
    }
}