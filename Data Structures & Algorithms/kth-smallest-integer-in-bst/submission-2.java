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

    // TC: O(n)
    // SC: O(h)

    int cnt = 0;
    int ans = -1;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return ans;
    }

    private void inorder(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        // Stop if we've already found the answer
        if (ans != -1) {
            return;
        }

        // Visit left subtree
        inorder(root.left, k);

        // Process current node
        cnt++;

        if (cnt == k) {
            ans = root.val;
            return;
        }

        // Visit right subtree
        inorder(root.right, k);
    }
}
