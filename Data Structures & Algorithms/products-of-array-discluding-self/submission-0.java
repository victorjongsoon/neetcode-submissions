class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] list1 = new int[nums.length];
        int[] list2 = new int[nums.length];
        int[] list3 = new int[nums.length];

        list1[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            list1[i] = nums[i - 1] * list1[i - 1];
        }


        list2[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            list2[i] = nums[i + 1] * list2[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            list3[i] = list1[i] * list2[i];
        }

        return list3;
    }
}  
