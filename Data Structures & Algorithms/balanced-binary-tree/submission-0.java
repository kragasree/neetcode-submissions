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
    int l = 0;
    int r = 0;

    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }

        int l = depth(root.left);
        int r = depth(root.right);

        if(Math.abs(l - r) > 1) {
            return false;
        }

        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);

        if(!left || !right) {
            return false;
        }

        return true;
    }

    public int depth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        return 1 + Math.max(depth(root.left), depth(root.right));
    }
}
