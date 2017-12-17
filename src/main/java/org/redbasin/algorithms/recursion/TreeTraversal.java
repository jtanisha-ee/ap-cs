package org.redbasin.algorithms.recursion;

/**
 * Created by manojjoshi on 8/27/17.
 */
public class TreeTraversal {

    static int sum = 0;

    public static void main(String[] args) {
        Node root = new Node();
        root.value = 3;
        Node left = new Node();
        left.value = 2;
        Node right = new Node();
        right.value = 8;
        root.left = left;
        root.right = right;
        Node left1 = new Node();
        left1.value = 7;
        Node right1 = new Node();
        right1.value = 1;
        left.left = left1;
        left.right = right1;
        Node left2 = new Node();
        left2.value = 5;
        right.left = left2;
        right.right = null;

        traverse(root);

        System.out.println(sumTraverse(root));
    }

    public static void traverse(Node node) {

        if (node.left != null)
            traverse(node.left);
        if (node.right != null)
            traverse(node.right);
        System.out.println(node.value);
    }

    public static int sumTraverse(Node node) {
        if (node.value > 4)
            sum = sum + node.value;
        if (node.left != null) {
            sum = sum + sumTraverse(node.left);
        }
        if (node.right != null) {
            sum = sum + sumTraverse(node.right);
        }
        return sum;
    }

}

class Node {
    public int value;
    public Node left;
    public Node right;
}
