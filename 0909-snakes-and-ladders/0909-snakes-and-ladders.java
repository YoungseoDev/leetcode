class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        boolean[] visited = new boolean[n*n+1];

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1); // 1번 칸에서 시작
        visited[1] = true;

        int moves = 0;

        while(!queue.isEmpty()) {
            int size = queue.size();
            //현재 depth

            for(int i = 0; i < size ; i++)
            {
                int curr = queue.poll();
                if(curr == n*n)
                {
                    return moves;
                }

                for(int dice = 1 ; dice <= 6 ; dice++)
                {
                    int next = curr + dice;
                    if(next > n * n)
                    {
                        continue;
                    }

                    int [] coords = getCoordinates(next, n);
                    int row = coords[0];
                    int col = coords[1];

                    if(board[row][col] != -1)
                    {
                        next = board[row][col];
                    }

                    if(!visited[next]){
                        visited[next] = true;
                        queue.offer(next);
                    }
                }

            }

            moves++;
        }

        return -1;

    }
      private int[] getCoordinates(int num, int n) {
            int row =  n - 1 - (num - 1) / n ;
            int col = (num - 1) % n;

            if((n-1 -row) % 2 == 1)
            {
                col = n - 1 - col;
            }

            return new int[]{row,col};
        }
}

   