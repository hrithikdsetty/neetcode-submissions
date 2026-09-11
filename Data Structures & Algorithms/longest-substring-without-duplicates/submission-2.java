class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int max = 0;

        int i=0;
        int j=0;

        while(i<s.length()){

            while(j<s.length() && !set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
            }

            max = Math.max(max, j-i);
            set.remove(s.charAt(i));
            i++;
        }

        return max;
        
    }
}
