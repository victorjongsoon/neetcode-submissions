class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++){
            char[] current = strs[i].toCharArray();
            Arrays.sort(current);
            String key = new String(current);

            if (!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(i);
        }

        List<List<String>> ans = new ArrayList<>();

        for (List<Integer> indexes : map.values()){
            List<String> group = new ArrayList<>();

            for (int index : indexes){
                group.add(strs[index]);
            }

            ans.add(group);
        }

        return ans;
    }
}
