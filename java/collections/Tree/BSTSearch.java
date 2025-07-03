class TreeNode1 {
    int data;
    TreeNode1 left, right;

    TreeNode1(int value) {
        data = value;
        left = right = null;
    }
}

public class BSTSearch {

    TreeNode1 root;

    void insert(int value) {
        root = insertRec(root, value);
    }

    TreeNode1 insertRec(TreeNode1 root, int value) {
        if (root == null) {
            return new TreeNode1(value);
        }

        if (value < root.data) {
            root.left = insertRec(root.left, value);
        } else if (value > root.data) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    boolean search(int key) {
        TreeNode1 current = root;

        while (current != null) {
            if (key == current.data) {
                return true;
            } else if (key < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        BSTSearch bs = new BSTSearch();
        bs.insert(7);
        bs.insert(13);
        bs.insert(17);
        bs.insert(19);
        bs.insert(23);

        int key1 = 7;
        int key2 = 50;
        if (bs.search(key1)) {
            System.out.println(key1 + " is found in the tree.");
        }
        if (!bs.search(key2)) {
            System.out.println(key2 + " is NOT found in the tree.");
        }
    }
}





















