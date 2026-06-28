class KthLargest {

    List<Integer> al;
    int kLargeEle;
    public KthLargest(int k, int[] nums) {
        kLargeEle = k;
        al = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            al.add(nums[i]);
        }
    }
    
    public int add(int val) {
        al.add(val);
        Collections.sort(al);
        return al.get(al.size() - kLargeEle);
    }
}
