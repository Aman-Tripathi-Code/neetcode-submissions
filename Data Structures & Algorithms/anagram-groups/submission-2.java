class Solution {
    // public String sortedString(String s){
    //     char [] characterArray = s.toCharArray();
    //     Arrays.sort(characterArray);
    //     return new String(characterArray);
    // }
    public List<List<String>> groupAnagrams(String[] strs) {
        //approach - 1 we will sort each string and sort them and use that as key and to that key we will maintain
        /*
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
        */

        //Approach - 2 New approach use the freq map to find the frequency as anagram will have same freq array then convert that array to string 1 1 2 1 -> 1#1#2#1# and use it as key
        Map<String,ArrayList<String>> map = new HashMap<>();
        for(String s: strs){
            int[] freq = new int[26];

            for(char ch: s.toCharArray()){
                freq[ch-'a']++;
            }

            StringBuilder key = new StringBuilder();

            for(int count: freq){
                key.append(count).append('#');
            }

            map.computeIfAbsent(key.toString(), k-> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
