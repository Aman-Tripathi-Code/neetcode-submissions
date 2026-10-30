class Solution {
public:
    bool isAnagram(string s, string t) {
        vector<int> hs(26,0);
        int n = s.size(), m = t.size();
        if(n != m) return false;
        for(int i = 0; i<n; i++){
            hs[s[i]-'a']++;
            hs[t[i]-'a']--;
        }
        for(auto &it: hs){
            if(it != 0) return false;
        }
        return true;
    }
};
