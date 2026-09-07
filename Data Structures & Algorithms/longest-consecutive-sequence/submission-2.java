class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0) return 0;
        
        Set<Integer> set = Arrays.stream(nums).mapToObj(Integer::valueOf).collect(Collectors.toSet());

        int longest = 1;

        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i]-1)){
                int length = 1;
                int j = nums[i]+1;
                while(set.contains(j)){
                    j++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;

    }
}
