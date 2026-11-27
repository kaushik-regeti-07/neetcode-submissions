class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int best = 0;

        while(l<r){
            int width = r-l;
            int h;
            if(heights[l]<heights[r]){
                h=heights[l];
            } else {
                h=heights[r];
            }

            int area = h*width;
            if(area>best){
                best=area;
            }
            if(heights[l]<heights[r]){
                l++;
            } else {
                r--;
            }
        }
        return best;
    }
}
