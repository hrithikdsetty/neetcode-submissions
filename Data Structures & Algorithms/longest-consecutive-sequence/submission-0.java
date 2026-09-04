class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = Arrays.stream(nums).mapToObj(Integer::valueOf).collect(Collectors.toSet());
        int max = 0;

        for(int i: nums){
            if(!set.contains(i-1)){
                int seq = 1;
                int temp = i+1;
                while(set.contains(temp)) {
                    seq++;
                    temp++;
                }
                max = Math.max(max,seq);
            }
        }

        return max;

        
    }
}
