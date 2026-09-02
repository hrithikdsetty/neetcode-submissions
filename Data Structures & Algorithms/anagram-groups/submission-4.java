class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = Arrays.stream(strs)
                .collect(Collectors.groupingBy(s->s.chars().sorted().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining())));
        return new ArrayList<>(map.values());
    }
}
