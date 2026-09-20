class Solution {
    public void sortColors(int[] nums) {
        // cnt array, cnt and then add back
        //TC: O(n)
        //SC: O(1)
        int cnt[] = new int[3];
        for(int i=0; i<nums.length; i++) {
            cnt[nums[i]]++;
        }

        int idx=0;
        for(int i=0; i<3; i++) {
            while(cnt[i]-- > 0) {
                nums[idx] = i;
                idx++;
            }
        }
        
    }
}