class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;

        int i=0;
        while(i<s.length()){

            Set<Character> set = new HashSet<>();

            int j=i;
            while(j<s.length() && !set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
            }

            max = Math.max(max, j-i);
            i++;
        }

        return max;
        
    }
}
