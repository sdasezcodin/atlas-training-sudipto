import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class RightSideViewTree {
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            TreeNode rightmost = null;

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                rightmost = curr;

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }

            res.add(rightmost.val);
        }

        return res;
    }

    public static void main(String[] args) {
        /*
              1
             / \
            2   3
             \   \
              5   4
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        List<Integer> view = rightSideView(root);
        System.out.println("Right Side View: " + view);
    }
}
