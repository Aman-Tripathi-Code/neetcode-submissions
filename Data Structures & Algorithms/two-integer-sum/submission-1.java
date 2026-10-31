class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Approach - 1 -> search using nested loop
        //TC - O(N^2) SC - O(1)
        int [] ans = new int[2];
        int n = nums.length;
        for(int i = 0; i<n; i++){
            int diff = target - nums[i];
            for(int j = i+1; j<n; j++){
                if(diff == nums[j]){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
