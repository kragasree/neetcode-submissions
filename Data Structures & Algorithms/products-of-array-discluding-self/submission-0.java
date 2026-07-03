class Solution {
    public int[] productExceptSelf(int[] nums) {
        //brute force
        int n = nums.length;
        int output[] = new int[n];
        for(int i=0; i<n; i++) {
            int prdt = 1;
            for(int j=0; j<n; j++) {
                if(j!=i) {
                    prdt = prdt * nums[j];
                }
            }
            output[i] = prdt;
        }

        return output;
    }
}  
