class Solution {
    public int maxArea(int[] heights) {
        int p1 = 0;
        int p2 = heights.length - 1;
        int max = Integer.MIN_VALUE;
        while(p1<p2) {
            // area = l(min(height[p1],height[p2]) * b(p2-p1)
            int area = Math.min(heights[p1],heights[p2]) * (p2-p1);

            if(area > max) {
                max = area;
            }
            if (heights[p1] < heights[p2]) {
                p1++;
            } else {
                p2--; 
            }

        }
        return max;
    }
}
