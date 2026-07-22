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
        // using dfs
        // intution -> I perform a DFS where I visit the current node, then the right subtree, and finally the left subtree. 
        // I maintain a list containing the first node seen at every depth. 
        // Whenever I reach a node, if ans.size() == depth, it means no node has been recorded for that depth yet, 
        // so I add the current node. Since I always explore the right subtree before the left subtree, 
        // the first node encountered at each depth is exactly the node visible from the right side. 
        // Therefore, the list itself becomes the right-side view."
        List<Integer> ans = new ArrayList<>();
        dfs(root, 0, ans);
        return ans;
    }

    void dfs(TreeNode node, int depth, List<Integer> ans) {
        if(node == null) {
            return;
        }

        // check list size with depth
        if(ans.size() == depth) {
            ans.add(node.val);
        }

        dfs(node.right,depth+1,ans);
        dfs(node.left,depth+1,ans);
    }

}
