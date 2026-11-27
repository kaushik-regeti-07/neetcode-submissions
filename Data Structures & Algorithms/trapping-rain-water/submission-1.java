class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] lm = new int[n];
        int[] rm = new int[n];

        lm[0] = height[0];
        for(int i=1;i<n;i++){
            if(height[i]>lm[i-1]){
                lm[i] = height[i];
            } else {
                lm[i] = lm[i-1];
            }
        }

        rm[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            if(height[i]>rm[i+1]){
                rm[i] = height[i];
            } else {
                rm[i] = rm[i+1];
            }
        }

        int total = 0;
        for(int i=0;i<n;i++){
            int level = lm[i];
            if(rm[i]<level){
                level = rm[i];
            }
            total += level - height[i];
        }
        return total;
    }
}
