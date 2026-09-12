class Solution {
    public boolean isPalindrome(String s) {
        String cleanString = s.chars().mapToObj(c->(char)c).filter(a->(a>='a' && a<='z') || (a>='A' && a<='Z') || (a>='0' && a<='9') ).map(b->String.valueOf(Character.toLowerCase(b))).collect(Collectors.joining());

        System.out.println(cleanString);

        int i=0;
        int j=cleanString.length()-1;

        while(i<j){
            if(cleanString.charAt(i)!=cleanString.charAt(j)) return false;
            i++;
            j--;
        }

        return true;

    }
}
