class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // to sort the array so that we can easily find the dup numbers
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        find(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    public void find(int start, int nums[], List<Integer> res, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(res));

        for(int i=start; i<nums.length; i++) {
            //to skip the same element
            if(i!=start && nums[i] == nums[i-1]) {
                continue;
            }
            //add the ele to list
            res.add(nums[i]);
            //find next subsets
            find(i+1,nums,res,ans);
            res.remove(res.size() - 1);
        }

    }
}