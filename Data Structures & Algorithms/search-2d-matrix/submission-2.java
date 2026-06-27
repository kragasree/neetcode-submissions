class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int r_t = 0, r_b = m - 1;
        //binary search to find the row, and fix the row
        // we will compare with the first and last ele of the row
        while(r_t <= r_b) {
            int row = (r_t + r_b) / 2;
            if (target > matrix[row][n - 1]) {
                r_t = row + 1;
            } else if (target < matrix[row][0]) {
                r_b = row - 1;
            } else {
                break;
            }
        }
        if (!(r_t <= r_b)) {
            return false;
        }
        int row = (r_t + r_b) / 2;
        //binary search over row to find the exact ele
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (target > matrix[row][mid]) {
                l = mid + 1;
            } else if (target < matrix[row][mid]) {
                r = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
