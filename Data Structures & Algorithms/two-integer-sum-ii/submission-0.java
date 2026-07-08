class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //TC: O(n^2)
        //SC: O(1)
        int res[] = new int[2];
        int n = numbers.length;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(numbers[i] + numbers[j] == target) {
                    res[0] = i+1;
                    res[1] = j+1;
                    break;
                }
            }
        }

        return res;
    }
}
