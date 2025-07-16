import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderFirstAndLast {
    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode() {
        }
        public TreeNode(int data) {
            this.data = data;
        }
    }

    public List<Integer> solve(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int lvlSize = q.size();
            TreeNode first = null, last = null;

            for (int i = 0; i < lvlSize; i++) {
                TreeNode curr = q.poll();

                if (i == 0) first = curr;
                if (i == lvlSize - 1) last = curr;

                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }

            if (first != null) res.add(first.data);
            if (last != null && last != first) res.add(last.data);
        }

        return res;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(11);
        root.left = new TreeNode(22);
        root.right = new TreeNode(33);
        root.left.left = new TreeNode(44);
        root.left.right = new TreeNode(55);
        root.right.right = new TreeNode(66);
        root.left.left.left = new TreeNode(77);
        root.left.left.right = new TreeNode(88);
        root.left.right.right = new TreeNode(99);
        root.right.right.left = new TreeNode(100);
        root.right.right.right = new TreeNode(114);

        LevelOrderFirstAndLast nt = new LevelOrderFirstAndLast();
        List<Integer> output = nt.solve(root);

        System.out.println("Output:");
        for (int val : output) {
            System.out.print(val + " ");
        }
    }
}













