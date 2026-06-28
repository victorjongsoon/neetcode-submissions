class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Time complexity: O(n)
        // Space complexity: O(n)    

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums){
            if (set.contains(num)){
                return true;
            } else {
                set.add(num);
            }
        }

        return false;
    }
}