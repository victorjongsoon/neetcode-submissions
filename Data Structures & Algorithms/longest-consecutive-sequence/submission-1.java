class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        if (nums.length == 0)
        {
            return 0;
        }
        
        HashSet<Integer> set = new HashSet<>();

        int longestCount = 1;
        int currentCount = 1;

        for (int num : nums)
        {
            set.add(num);
        }

        for (int num : set)
        {
            int currentNum = num;
            if (!set.contains(currentNum- 1)) // found the number for the start of a new sequence
            {
                while (set.contains(currentNum + 1))
                {
                    currentCount++;
                    currentNum++;
                }
                longestCount = Math.max(longestCount, currentCount);
                currentCount = 1;
            }
        }

        return longestCount;
    }
}
