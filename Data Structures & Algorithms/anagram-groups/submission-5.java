class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        return Arrays.stream(strs).collect(Collectors.groupingBy(
            s->s.chars().sorted().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining())
        )).values().stream().toList();
    }
}
