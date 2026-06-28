class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // frequency table
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // frequency table keys to list
        List<Integer> keys = new ArrayList<>(map.keySet());

        keys.sort((a, b) -> map.get(b) - map.get(a));

        // collect top k
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = keys.get(i);
        }

        return result;
    }
}
