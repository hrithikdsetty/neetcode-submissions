class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Long> map = Arrays.stream(nums).mapToObj(Integer::valueOf).collect(Collectors.groupingBy(s->s, Collectors.counting()));

        PriorityQueue<Map.Entry<Integer,Long>> minHeap = new PriorityQueue<>(Comparator.comparingLong(e->e.getValue()));

        for(Map.Entry<Integer,Long> entry: map.entrySet()){
            if(minHeap.size()<k) minHeap.offer(entry);
            else{
                if(minHeap.peek().getValue()<entry.getValue()){
                    minHeap.poll();
                    minHeap.offer(entry);
                }
            }

        }

        int [] res = new int [k];

        for(int i=0; i<k; i++){
            res[i] = minHeap.poll().getKey();
        }

        return res;

    }
}
