class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> main = new ArrayList<>();
        for (int i=0; i<n; i++) {
            // this check is same, previous ele at i should not be equal to current ele at i
            // if same na go to next
            if(i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            int j = i+1;
            int k = n-1;
            while (j<k) {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum < 0) {
                    j++;
                }
                else if(sum > 0) {
                    k--;
                }
                else {
                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                    ans.add(nums[k]);
                    main.add(ans);
                    j++;
                    k--;

                    // next we have to increase j and decrease k
                    // also check both of them dont cross and next element is not the same as previous element
                    while(j<k && nums[j] == nums[j-1]) {
                        j++;
                    }
                    while(j<k && nums[k] == nums[k+1]) {
                        k--;
                    }

                }
            }
        }
        return main;
    }
}