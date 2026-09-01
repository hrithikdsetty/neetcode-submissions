class Solution {

    public String encode(List<String> strs) {
        return strs.stream().map(s->s.length()+"#"+s).collect(Collectors.joining());
    }

    public List<String> decode(String str) {

        if(str.isEmpty()){
            return new ArrayList<>();
        }

        List<String> res = new ArrayList<>();

        int i=0;

        while(i<str.length()){
            int j=i;

            while(str.charAt(j)!='#'){
                j++;
            }

            String lenStr = str.substring(i,j);

            int length = Integer.parseInt(lenStr);

            String temp = str.substring(j+1, j+1+length);

            res.add(temp);

            i=j+1+length;
        }

        return res;

    }
}
