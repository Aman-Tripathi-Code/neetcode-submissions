class Solution {
    public String sortedString(String s){
        char [] characterArray = s.toCharArray();
        Arrays.sort(characterArray);
        return new String(characterArray);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        //approach - 1 we will sort each string and sort them and use that as key and to that key we will maintain

        Map<String,ArrayList<String>> map = new HashMap<>();
        for(String s: strs){
            String newString = sortedString(s);
            if(!map.containsKey(newString)){
                map.put(newString, new ArrayList<String>());
            }
            map.get(newString).add(s);
        }
        List<List<String>> ans = new ArrayList<>();
        map.forEach((key,stringArray) -> {
            ans.add(stringArray);
        });

        return ans;

    }
}
