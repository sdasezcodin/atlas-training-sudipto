class TreeNode {
    double data;
    TreeNode left;
    TreeNode right;

    TreeNode() {
        data = Math.round(Math.random() * 100) / 100.0;
        left = null;
        right = null;
    }
}

public class TreeDemo {
    TreeNode root;

    void insert() {
        TreeNode tn = new TreeNode();
        root = findPos(root, tn);
    }

    TreeNode findPos(TreeNode curr, TreeNode tn) {
        if (curr == null) {
            return tn;
        }
        if (tn.data < curr.data) {
            curr.left = findPos(curr.left, tn);
        } else {
            curr.right = findPos(curr.right, tn);
        }
        return curr;
    }

    void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    void inorderDisplay(TreeNode node, String position) {
        if (node == null) {
            System.out.println(position + ": null");
            return;
        }

        System.out.println(position + ": " + node.data);
        inorderDisplay(node.left, "  Left of " + node.data);
        inorderDisplay(node.right, "  Right of " + node.data);
    }

    public static void main(String[] args) {
        TreeDemo td = new TreeDemo();
        for (int i = 0; i < 11; i++) {
            td.insert();
        }

        td.inorder(td.root);

        System.out.println("\n Tree structure with labels:");
        td.inorderDisplay(td.root, "  Root");
    }
}





















