class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        //TC: O(n^2)
        //SC: O(1)
        int top = 0;
        int bottom = matrix.length;
        int left = 0;
        int right = matrix[0].length;

        List<Integer> ans = new ArrayList<>();

        while (top < bottom && left < right) {

            // Go right
            for (int j = left; j < right; j++) {
                ans.add(matrix[top][j]);
            }
            top++;

            // Go down
            for (int i = top; i < bottom; i++) {
                ans.add(matrix[i][right - 1]);
            }
            right--;

            // check again because the matrix
            // may have only one row/column remaining
            if (!(top < bottom && left < right)) {
                break;
            }

            // Go left
            for (int j = right - 1; j >= left; j--) {
                ans.add(matrix[bottom - 1][j]);
            }
            bottom--;

            // Go up
            for (int i = bottom - 1; i >= top; i--) {
                ans.add(matrix[i][left]);
            }
            left++;
        }

        return ans;
    }
}