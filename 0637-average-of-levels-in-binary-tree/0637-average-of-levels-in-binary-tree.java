/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> answer = new ArrayList<>();

        queue.offer(root); // plus root Node into Queue

        while(!queue.isEmpty())
        {
            int levelSize = queue.size();
            int sum = 0;
            List <Integer> currentLevel = new ArrayList<>();

            for(int i = 0 ; i < levelSize; i++)
            {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                sum += currentNode.val;

                if(currentNode.left != null)
                {
                    queue.offer(currentNode.left);
                }

                if(currentNode.right != null)
                {
                    queue.offer(currentNode.right);
                }

             }
            double average = (double)sum / (double)levelSize ;
            answer.add(average);
        }
    return answer;
}
}