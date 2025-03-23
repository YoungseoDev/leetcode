class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        Queue<String> queue = new LinkedList<>();

        boolean []visited = new boolean[wordList.size()];

        int answer = 1;


        queue.offer(beginWord);

        while(!queue.isEmpty())
        {
            int size = queue.size();

            for(int i = 0; i < size ; i++)
            {
                String curr = queue.poll();

                if(curr.equals(endWord))
                {
                    return answer;
                }

                for(int k = 0; k < wordList.size();k++)
                {
                    if(check(curr,wordList.get(k)) && !visited[k])
                    {
                        queue.offer(wordList.get(k));
                        visited[k] = true;
                    }
                }
            }
            answer++;
        }

        return 0;

    }



    boolean check(String a, String b)
    {
        int record = 0;

        for(int i = 0; i < a.length(); i++)
        {
            if(a.charAt(i) != b.charAt(i))
                record++;
        }

        return record == 1;
    }
}