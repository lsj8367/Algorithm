package 인프런.ex7;

public class Ex7_08_dfs {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(dfs(0, root));
    }

    private static int dfs(int depth, Node root) {
        if (root.left == null && root.right == null) {
            return depth;
        }

        return Math.min(dfs(depth + 1, root.left), dfs(depth + 1, root.right));
    }

    private static class Node {

        int value;
        Node left;
        Node right;

        public Node(final int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

    }

}
