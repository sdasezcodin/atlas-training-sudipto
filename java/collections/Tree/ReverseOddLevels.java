import java.util.*;

public class ReverseOddLevels {

    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode reverseOddLevels(TreeNode root) {
        if (root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode[] levelNodes = new TreeNode[size];

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                levelNodes[i] = node;

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            if (level % 2 == 1) {
                int left = 0, right = size - 1;
                while (left < right) {
                    int temp = levelNodes[left].val;
                    levelNodes[left].val = levelNodes[right].val;
                    levelNodes[right].val = temp;
                    left++;
                    right--;
                }
            }
            level++;
        }

        return root;
    }

    public static void printLevelOrder(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                System.out.print(node.val + " ");
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ReverseOddLevels sol = new ReverseOddLevels();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println("Before reverse:");
        printLevelOrder(root);
        sol.reverseOddLevels(root);
        System.out.println("\nAfter reverse:");
        printLevelOrder(root);
    }
}
