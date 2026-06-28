class Solution {
    // Time: O(n) because stream processes each number in nums, and distinct() checks/stores each value once
    // Space: O(n) because distinct() needs extra storage to remember the unique values it already has seen
    public boolean hasDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}