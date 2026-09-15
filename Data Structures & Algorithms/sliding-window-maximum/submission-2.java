class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int[] res = new int[nums.length-k+1];
        int resIndex=0;
        int l=0;

        for(int i=0; i<nums.length; i++){
            maxHeap.offer(nums[i]);

            if(maxHeap.size()==k){
                res[resIndex] = maxHeap.peek();
                resIndex++;
                maxHeap.remove(nums[l]);
                l++;     
            }


        }

        return res;
    }
}
