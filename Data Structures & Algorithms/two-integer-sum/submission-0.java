class Solution {
    public int[] twoSum(int[] nums, int target) {
        //  BRUTE FORCE -> loop array and check if sum is equal to target, TC: O(n^2), SC: O(1)
        //  1) Find b = target - a in the array. we use map, hashing, TC: O(nlogn), SC: O(n)
        //  2) 2 pointers -> This we will sort bcoz of that indexing will be disturbed, so we have to store both index and ele in some array so not optimal.
        //  3) Binary search -> same pnt 2


        int arr[] = new int[2];
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        for (int i=0; i<nums.length; i++) {
            int b = target - nums[i];
            if(mp.containsKey(b)) {
                arr[0] = mp.get(b); 
                arr[1] = i;
                break;
            }
            mp.put(nums[i],i);
        }
        return arr;

    }
}