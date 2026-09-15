class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> res = new ArrayList<>();
        int l=0;

        for(int i=0; i<nums.length; i++){
            maxHeap.offer(nums[i]);

            if(maxHeap.size()==k){
                res.add(maxHeap.peek());
                maxHeap.remove(nums[l]);
                l++;     
            }


        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
