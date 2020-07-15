package tree;

public class HeightOfTree {

    public static long solution(long[] tree) {
        // Type your solution here
        if (tree.length == 0) {
            return 0;
        }

        Node node = insertLevelOrder(tree, new Node(0), 0);

        return heightOfTree(node);
    }

    public static int heightOfTree(Node node) {
        if (node.left == null || node.right == null) {
            return 0;
        }
        return 1 + Math.max(heightOfTree(node.left), heightOfTree(node.right));
    }

    public static Node insertLevelOrder(long[] arr, Node root, int i) {
        if (i < arr.length) {
            Node temp = new Node(arr[i]);
            root = temp;
            root.left = insertLevelOrder(arr, root.left, 2 * i + 1);
            root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
        }
        return root;
    }

    static class Node {
        long data;
        Node left, right;

        Node(long data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String args[]) {
        HeightOfTree t2 = new HeightOfTree();
        long arr[] = {1, -1,1};
        System.out.println(t2.solution(arr));
    }
}
