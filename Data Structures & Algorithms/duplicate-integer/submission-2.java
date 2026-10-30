class Solution {
    public boolean hasDuplicate(int[] nums) {
        //approach 1 sort the array and iterate the list if 2 adjacent element
        //are same then return true
        //Time Complexity - O(nlog(n)) Space Complexity - O(1);
        /*
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i<n-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
        */

        //Approach 2 -> Use a set to track the element so while iterating the array if an element is already present
        //then return false
        //Time Complexity - O(n) Space Complexity - O(n);
        
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i<n; i++){
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
        
    }
}