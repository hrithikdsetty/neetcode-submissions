class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length()>s2.length()) return false;

        Map<Character, Long> s1Map = s1.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, Collectors.counting()));
        Map<Character, Long> windowMap = new HashMap<>();

        int i=0;
        for(int j=0; j<s2.length(); j++){

            if(j<s1.length()){
                windowMap.put(s2.charAt(j), windowMap.getOrDefault(s2.charAt(j), 0L)+1L);
                continue;
            }

            if(s1Map.equals(windowMap)) return true;

            windowMap.put(s2.charAt(j), windowMap.getOrDefault(s2.charAt(j), 0L) + 1L);

            if(windowMap.get(s2.charAt(i))==1L){
                windowMap.remove(s2.charAt(i));
            } else{
                windowMap.put(s2.charAt(i), windowMap.get(s2.charAt(i))-1L);
            }
            i++;

        }

        return s1Map.equals(windowMap);
    }
}
