class Solution {
    public boolean isPalindrome(String s) {
        String temp = s.chars().filter(c-> (c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9')).mapToObj(c->String.valueOf((char) c)).map(c->c.toUpperCase()).collect(Collectors.joining());

        System.out.println(temp);

        int i = 0;

        int j = temp.length()-1;

        while(i<=j){
            if(temp.charAt(i)!=temp.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }
}
