class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for( String word : strs)
        {
            //단어를 문자열로 만든다.
            char[] chars = word.toCharArray();
            //단어를 정렬, ex) eat -> ate
            Arrays.sort(chars);
            // "a", "t", "e" -> ate
            String sorted = new String(chars);


            if(!map.containsKey(sorted))
            {
                map.put(sorted, new ArrayList<>());
            } 

            map.get(sorted).add(word);   


        }

        //모든 anagram 그룹을 리스트 형태로 반환.
        return new ArrayList<>(map.values());
        
    }
}