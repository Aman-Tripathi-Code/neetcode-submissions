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
        //TC - O(max(n,m)*log(max(m,n))), SC - O(1)

        return sortedString(s).equals(sortedString(t));
    }
}
