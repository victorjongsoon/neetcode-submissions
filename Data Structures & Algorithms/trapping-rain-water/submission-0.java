class Solution 
{
    public int trap(int[] height) 
    {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int totalWater = 0;

        while (left < right)
        {
            // process left
            if (height[left] < height[right])
            {
                if (height[left] > leftMax)
                {
                    leftMax = height[left];
                }
                else
                {
                    totalWater += leftMax - height[left];
                }
                left++;
            }
            else // process right
            {
                if (height[right] > rightMax)
                {
                    rightMax = height[right];
                }
                else
                {
                    totalWater += rightMax - height[right];
                }
                right--;
            }
        }    

        return totalWater;
    }
}
