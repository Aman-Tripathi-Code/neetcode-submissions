class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        //Approach - 1 -> search using nested loop
        //TC - O(N^2) SC - O(1)
        // for(int i = 0; i<n; i++){
        //     int diff = target - nums[i];
        //     for(int j = i+1; j<n; j++){
        //         if(diff == nums[j]){
        //             ans[0] = i;
        //             ans[1] = j;
        //             return ans;
        //         }
        //     }
        // }
        //Approach 2 -> we can use hashmap to store the first index of that element and if for a given elment if the target - element exist we can return that

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
           int diff = target - nums[i];
           if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
           }
           map.putIfAbsent(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
