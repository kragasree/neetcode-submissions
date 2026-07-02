class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[k];

        HashMap<Integer, Integer> cntMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            cntMap.put(nums[i], cntMap.getOrDefault(nums[i], 0) + 1);
        }

        List<int[]> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : cntMap.entrySet()) {
            list.add(new int[] {entry.getValue(), entry.getKey()});
        }

        Collections.sort(list, (a, b) -> b[0] - a[0]);

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i)[1];
        }

        return ans;
    }
}