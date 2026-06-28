class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Time complexity O(n)
        // Space complexity O(n)
        Set<Integer> seen = new HashSet<>(); // Stores unique variable

        for (int num : nums){
            if (!seen.add(num)){
                return true;
            }
        }

        return false;
    }
}