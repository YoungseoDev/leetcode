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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> answer = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        if(root == null)
        {
            return answer;
        }
        
        while(!queue.isEmpty())
        {
            int levelSize = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0 ; i < levelSize ; i++)
            {
                
                TreeNode currentNode = queue.poll();

                if(currentNode.left != null)
                {
                    queue.offer(currentNode.left);
                }

                if(currentNode.right!= null)
                {
                    queue.offer(currentNode.right);
                }

                list.add(currentNode.val);
                
            }

            answer.add(list);
        }

        return answer;
    }
}