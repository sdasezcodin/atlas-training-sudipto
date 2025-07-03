class TreeNode2 {
    int data;
    TreeNode2 left, right;

    TreeNode2(int value) {
        data = value;
        left = right = null;
    }
}

public class BSTDel {

    TreeNode2 root;

    void insert(int value) {
        root = insertRec(root, value);
    }

    TreeNode2 insertRec(TreeNode2 root, int value) {
        if (root == null) {
            return new TreeNode2(value);
        }

        if (value < root.data) {
            root.left = insertRec(root.left, value);
        } else if (value > root.data) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    TreeNode2 del(TreeNode2 root, int data) {
        if (root == null) return null;

        if (data < root.data) {
            root.left = del(root.left, data);
        } else if (data > root.data) {
            root.right = del(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children
            TreeNode2 successor = findMin(root.right);
            root.data = successor.data;
            root.right = del(root.right, successor.data); // delete successor node
        }
        return root;
    }

    TreeNode2 findMin(TreeNode2 node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    void inorder(TreeNode2 node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        BSTDel bs = new BSTDel();
        bs.insert(7);
        bs.insert(13);
        bs.insert(17);
        bs.insert(19);
        bs.insert(23);

        System.out.print("Before deletion: ");
        bs.inorder(bs.root);
        System.out.println();

        int key = 7;
        bs.root = bs.del(bs.root, key);

        System.out.println(key + " deleted");

        System.out.print("After deletion: ");
        bs.inorder(bs.root);
    }
}





















