class Solution {
    public int trap(int[] height) {

        int n = height.length;

        int [] prefix = new int[n];

        int [] suffix = new int [n];

        int prefMax = Integer.MIN_VALUE;
        int suffMax = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            prefMax = Math.max(prefMax, height[i]);
            prefix[i] = prefMax;
            suffMax = Math.max(suffMax, height[n-i-1]);
            suffix[n-i-1] = suffMax;
        }

        int res = 0;

        for(int i=0; i<n; i++){
            int waterAtIndex = Math.min(prefix[i], suffix[i])-height[i];
            res = res+waterAtIndex;
        }

        return res;
    }
}
