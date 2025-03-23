class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {

        int change = 0;
        boolean[] visited = new boolean[bank.length];

        Queue<String> queue = new LinkedList<>();

        queue.offer(startGene);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String curr = queue.poll();

                if (curr.equals(endGene)) {
                    return change;
                }
                for (int k = 0; k < bank.length; k++) {
                    if (check(curr, bank[k]) && visited[k] == false) {
                        queue.offer(bank[k]);
                        visited[k] = true;
                    }
                }
            }
            change++;

        }

        return -1;

    }

    boolean check(String a, String b) {
        int record = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                record++;
        }

        if (record == 1)
            return true;
        else
            return false;
    }
}