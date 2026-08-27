class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int [][] util = new int [nums.length][2];
        int [] res = new int[2];

        for (int i=0; i<nums.length; i++){
            util[i][0] = nums[i];
            util[i][1] = i;
        }

        Arrays.sort(util, (a,b)->Integer.compare(a[0],b[0]));

        int i=0;
        int j=util.length-1;

        while(i<=j){

            int temp = util[i][0]+util[j][0];

            if(temp==target){
                res[0] = Math.min(util[i][1], util[j][1]);
                res[1] = Math.max(util[i][1], util[j][1]);
                break;
            } else if(temp<target){
                i++;
            } else {
                j--;
            }

        }

        return res;

    }
}
