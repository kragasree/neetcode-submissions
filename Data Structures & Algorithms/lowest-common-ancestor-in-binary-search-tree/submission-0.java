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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        //If both p and q are smaller than root, both nodes lie in the left subtree → recursively search left.
        //If both are greater than root, both lie in the right subtree → recursively search right.
        //Otherwise, one is on each side or one of them is the root itself → this is the split point, so the current root is the LCA.


        // TC: O(log n), bcoz we are gng deeper and deeper based on height. So h = log n, TC => O(h) => O(log n)
        // SC: O(h), bcoz we are using recirsion where we will store everything in recursive stack. 
        if(root == null) {
            return null;
        }
        TreeNode lca = lca(root,p,q);

        return lca;
    }

    TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return null;
        }

        if (p.val < root.val && q.val < root.val) {
            return lca(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            return lca(root.right, p, q);
        } else {
            return root;
        }
    }
}
