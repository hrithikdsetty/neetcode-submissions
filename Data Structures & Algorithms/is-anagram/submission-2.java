class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Long> sMap = frequencyMap(s);
        Map<Character,Long> tMap = frequencyMap(t);

        if(sMap.entrySet().size()!=tMap.entrySet().size()) return false;

        for(Map.Entry<Character,Long> entry: sMap.entrySet()){
            if(!tMap.containsKey(entry.getKey()) || !entry.getValue().equals(tMap.get(entry.getKey()))) {
                return false;
            }
        }

        return true;
    }

    private Map<Character, Long> frequencyMap(String s){
        return s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, Collectors.counting()));
    }
}
