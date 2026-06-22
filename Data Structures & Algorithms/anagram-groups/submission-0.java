class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> strGroups = new HashMap<>();

        for(String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if(!strGroups.containsKey(sorted)){
                strGroups.put(sorted, new ArrayList<>());
            } 

            strGroups.get(sorted).add(word);
        }

        return new ArrayList<>(strGroups.values());
    }
}
