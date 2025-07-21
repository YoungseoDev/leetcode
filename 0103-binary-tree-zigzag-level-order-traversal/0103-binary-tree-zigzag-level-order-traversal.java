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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> answer = new ArrayList<>();

        if(root == null)
        {
            return answer;
        }

        queue.offer(root);
        int leftToRight = 1;

        while(!queue.isEmpty())
        {
            int levelSize = queue.size();
            List<Integer> list = new LinkedList<>();
            

            for(int i = 0 ; i < levelSize; i++)
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

                if(leftToRight % 2 != 0 )
                {
                    list.add(currentNode.val);
                }
                else
                {
                    list.addFirst(currentNode.val);
                }
            }
            answer.add(list);
            leftToRight++;
        }

        return answer;
        
    }
}