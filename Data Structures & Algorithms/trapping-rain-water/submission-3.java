class Solution {
    public int trap(int[] height) {
       int i=0;
       int j=height.length-1;

       int maxL=height[i];
       int maxR=height[j];

       int max = 0;

       while(i<j){
        if(maxL<maxR){
            max+= maxL-height[i];
            i++;
            maxL = Math.max(maxL,height[i]);
        } else {
            max+= maxR-height[j];
            j--;
            maxR = Math.max(maxR, height[j]);
        }
       }

       return max;
    }
}
