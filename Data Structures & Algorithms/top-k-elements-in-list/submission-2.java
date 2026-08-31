class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Long> map = Arrays.stream(nums).mapToObj(Integer::valueOf).collect(Collectors.groupingBy(s->s, Collectors.counting()));

        PriorityQueue<Map.Entry<Integer,Long>> minHeap = new PriorityQueue<>(Map.Entry.comparingByValue());

        for (Map.Entry<Integer,Long> entry: map.entrySet()){
            if(minHeap.size()<k){
                minHeap.offer(entry);
            } else{
                if(minHeap.peek().getValue()<entry.getValue()){
                    minHeap.poll();
                    minHeap.offer(entry);
                }
            }
        }

        int [] res = new int [minHeap.size()];

        for(int i=minHeap.size()-1; i>=0; i--){
            res[i] = minHeap.poll().getKey();
        }

        return res;
        
    }
}
