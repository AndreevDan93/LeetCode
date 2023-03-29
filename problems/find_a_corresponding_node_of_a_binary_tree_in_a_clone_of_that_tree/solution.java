/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
       Stack<TreeNode> stack = new Stack<>();
        stack.add(cloned);
        while (!stack.empty()) {
            TreeNode treeNode = stack.pop();
            if (treeNode.val == target.val) {
                return treeNode;
            }
            if (treeNode.left != null) {
                stack.add(treeNode.left);
            }
            if (treeNode.right != null) {
                stack.add(treeNode.right);
            }
        }
        return null;
    }
}
