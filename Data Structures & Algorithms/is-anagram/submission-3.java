class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Long> sMap = frequencyMap(s);
        Map<Character,Long> tMap = frequencyMap(t);


        return sMap.equals(tMap);
    }

    private Map<Character, Long> frequencyMap(String s){
        return s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, Collectors.counting()));
    }
}
