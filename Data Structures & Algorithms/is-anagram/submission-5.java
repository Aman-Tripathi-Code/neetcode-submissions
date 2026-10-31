class Solution {
    public String sortedString(String s){
        char [] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public boolean isAnagram(String s, String t) {
        int n = s.length(), m = t.length();
        if(n != m) return false;
        //Approach - 1 -> sort both the string lexographically and then check if both the string are equal
        //TC - O(nlog(n)), SC - O(1)
        // return sortedString(s).equals(sortedString(t));

        //Approach - 2 -> take a freq array and increase freq for particular element iterating both the string
        //TC - O(n), SC - O(26)
        int [] freq = new int[26];

        for(int i = 0; i<n; i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i<26; i++){
            if(freq[i] != 0) return false;
        }
        return true;

    }
}
