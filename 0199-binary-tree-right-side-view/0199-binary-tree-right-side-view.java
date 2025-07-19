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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();

        if(root == null)
        {
            return answer;
        }

        queue.offer(root);
        while(!queue.isEmpty())
        {
        int levelSize = queue.size();
        

        for(int i = 0; i < levelSize ; i++)
        {
            TreeNode currentNode = queue.poll();

            if(currentNode.left != null)
            {
                queue.offer(currentNode.left);
            }

            if(currentNode.right != null)
            {
                queue.offer(currentNode.right);
            }

            if(i == levelSize - 1)
            {
                answer.add(currentNode.val);
            }
        }

        }

        return answer;




        }


        
}
