class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n-1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;  // no carry
            }
            digits[i] = 0;  // was 9, becomes 0, carry continues
        }

        //all digits were 9 → e.g. 999 → 1000
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}