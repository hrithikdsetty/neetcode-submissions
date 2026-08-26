class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        System.out.println(start);

        int end = Arrays.stream(piles).max().getAsInt();

        System.out.println(end);

        int k = Integer.MAX_VALUE;

        while(start<=end){
            int mid=start+(end-start)/2;
            int expectedH = calculateh(piles,mid);

            if(expectedH>h){
                start = mid+1;
            } else {
                k = Math.min(mid, k);
                end = mid-1;
            }
            
        }

        return k;

    }

    private int calculateh(int [] piles, int k){

        return Arrays.stream(piles)
            .map(a->(a/k)+(a%k==0?0:1))
            .sum();

    }
}
