class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Long> mapT = t.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, Collectors.counting()));

        Map<Character, Long> window = new HashMap<>();

        int l=0;
        int minSubStringLength = Integer.MAX_VALUE;
        int[] res = {-1, -1};
        int have = 0, need = mapT.size();

        for( int r = 0; r<s.length(); r++){
            char c = s.charAt(r);

            window.put(c, window.getOrDefault(c,0L)+1L);

            if(mapT.containsKey(c) && mapT.get(c).equals(window.get(c))) have++;

            while(have==need){
                if((r-l+1) < minSubStringLength){
                    res[0] = l;
                    res[1] = r;
                    minSubStringLength = r-l+1;
                }

                char leftChar = s.charAt(l);
                window.put(leftChar, window.get(leftChar)-1L);

                if(mapT.containsKey(leftChar) && window.get(leftChar) < mapT.get(leftChar)){
                    have--;
                }

                l++;
            }


        }

        return minSubStringLength == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1]+1);

        
    }
}
