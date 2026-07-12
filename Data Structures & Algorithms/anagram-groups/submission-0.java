class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans = new HashMap<>();

        for(int i=0; i<strs.length; i++) {
            char[] charArr = strs[i].toCharArray();
            //sort the array
            Arrays.sort(charArr);
            String sorted = new String(charArr);

            ans.putIfAbsent(sorted, new ArrayList<>());

            ans.get(sorted).add(strs[i]);

        }

        return new ArrayList<>(ans.values());
    }
}
