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
    public int kthSmallest(TreeNode root, int k) {
        // TC: O(nlogn) + O(n) = O(nlogn)
        //SC: O(n)

        List<Integer> al = new ArrayList<>();

        add(root,al);

        //Sort list and return the Kth smallest val
        Collections.sort(al);

        int cnt = 0;
        for(int i=0; i<al.size(); i++) {
            cnt++;
            if(cnt == k) {
                return al.get(i);
            }
        }

        return -1;


    }

    public void add(TreeNode root, List<Integer> al) {
        if(root == null) {
            return;
        }

        //doing preorder traversal and sorting
        al.add(root.val);
        add(root.left, al);
        add(root.right, al);
    }
}
