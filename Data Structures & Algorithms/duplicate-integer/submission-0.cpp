class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_set<int> st;
        for(auto &it: nums){
            if(st.contains(it)){
                return true;
            }
            st.insert(it);
        }
        return false;
    }
};