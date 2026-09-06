class Solution {
    public boolean isAnagram(String s, String t) {
        String sortedS = s.chars().sorted().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());

        String sortedT = t.chars().sorted().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());

        return sortedS.equals(sortedT);
    }
}
