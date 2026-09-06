public class Solution {
    public int removeDuplicates(int[] nums) {
        //TC: O(nlogn)
        TreeSet<Integer> st = new TreeSet<>();
        for(int i=0; i<nums.length; i++) {
            st.add(nums[i]);
        }
        Iterator<Integer> it = st.iterator();

        for (int i = 0; it.hasNext(); i++) {
            nums[i] = it.next();
        }
        return st.size();
    }
}