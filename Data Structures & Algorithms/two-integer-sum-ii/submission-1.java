class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //TC: O(n)
        //SC: O(1)

        int p1 = 0, p2 = numbers.length-1;
        int res[] = new int[2];

        while(p1<p2) {
            if(numbers[p1] + numbers[p2] == target) {
                res[0] = p1+1;
                res[1] = p2+1;
                break;
            } else if(numbers[p1] + numbers[p2] < target) {
                p1++;
            } else {
                p2--;
            }
        }

        return res;
    }
}
