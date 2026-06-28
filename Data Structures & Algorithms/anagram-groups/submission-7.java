class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            // convert to array
            char[] a = strs[i].toCharArray();
            // sort the characters
            Arrays.sort(a);
            // convert to string
            String key = new String(a);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(strs[i]);
        }

        return new ArrayList<>(map.values()); 
    }
}
