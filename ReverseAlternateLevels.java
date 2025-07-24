import java.util.*;

class MyNode {
    int val;
    MyNode left, right;

    MyNode(int x) {
        val = x;
    }
}

public class ReverseAlternateLevels {

    public static void reverseAlternate(MyNode root) {
        if (root == null) return;
        reverseHelper(root.left, root.right, 1);
    }

    private static void reverseHelper(MyNode left, MyNode right, int level) {
        if (left == null || right == null) return;

        if (level % 2 == 1) {
            // Swap the values
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }

        reverseHelper(left.left, right.right, level + 1);
        reverseHelper(left.right, right.left, level + 1);
    }

    public static void printLevelOrder(MyNode root) {
        if (root == null) return;

        Queue<MyNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                MyNode curr = q.poll();
                System.out.print(curr.val + " ");
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /*
                  1
                /   \
              2       3
             / \     / \
            4   5   6   7
        */

        MyNode root = new MyNode(1);
        root.left = new MyNode(2);
        root.right = new MyNode(3);
        root.left.left = new MyNode(4);
        root.left.right = new MyNode(5);
        root.right.left = new MyNode(6);
        root.right.right = new MyNode(7);

        System.out.println("Before reversing alternate levels:");
        printLevelOrder(root);

        reverseAlternate(root);

        System.out.println("After reversing alternate levels:");
        printLevelOrder(root);
    }
}
