class Solution {

    public String encode(List<String> strs) {
        return strs.stream().map(s->s.length()+"#"+s).collect(Collectors.joining());
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();

        int i=0;

        while(i<str.length()){

            int j=i;

            while(str.charAt(j)!='#') j++;

            int length = Integer.parseInt(str.substring(i, j));

            ans.add(str.substring(j+1, j+length+1));

            i = j+length+1; 

        }

        return ans;
       
    }
}
