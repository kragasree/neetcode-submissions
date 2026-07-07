class Solution {
    public int maxSubArray(int[] nums) {
        //Kadane's algo
        int max = nums[0];
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            if(sum < 0) {
                sum = 0;
            }
            sum = sum + nums[i];
            max = Math.max(sum,max);
        }
        return max;
    }
}
