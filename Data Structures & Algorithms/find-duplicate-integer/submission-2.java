class Solution {
    public int findDuplicate(int[] nums) {
        //use set
        Set<Integer> st = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            if(st.contains(nums[i])) {
                return nums[i];
            }

            st.add(nums[i]);
        }

        return -1;

        //TC: O(n)
        //SC: O(n)
    }
}
