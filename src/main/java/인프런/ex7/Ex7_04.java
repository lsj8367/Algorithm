package 인프런.ex7;

public class Ex7_04 {

    private static void dfs(Node n) {
        if (n == null) {
            return;
        }

        System.out.print(n.value + " "); //전위 표기식
        dfs(n.left);
        dfs(n.right);
    }

    public static void main(String[] args) {
        Ex7_04.Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        dfs(root);
    }

    private static class Node {

        Node left;
        Node right;
        private int value;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

    }

}
