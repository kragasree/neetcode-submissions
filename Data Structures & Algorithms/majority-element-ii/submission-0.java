public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int num : nums) {
            cnt.put(num, cnt.getOrDefault(num, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();
        for (int key : cnt.keySet()) {
            if (cnt.get(key) > nums.length / 3) {
                res.add(key);
            }
        }

        return res;
    }
}