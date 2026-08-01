class Solution {
    // Time: O(n) because we only move through the string once
    // Space: O(m) because the HashMap stores each unqiue character and the index we last saw it  
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int left = 0, right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if (map.containsKey(currentChar) && map.get(currentChar) >= left) {
                left = map.get(currentChar) + 1;
            }
            map.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
