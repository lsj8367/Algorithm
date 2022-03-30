package 인프런.ex7;

import java.util.LinkedList;
import java.util.Queue;

public class Ex7_08_bfs {

    public static int bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int depth = 0;

        while (!q.isEmpty()) {
            int length = q.size();

            for (int i = 0; i < length; i++) {
                Node currentNode = q.poll();
                if (currentNode.left == null && currentNode.right == null) {
                    return depth;
                }

                if (currentNode.left != null) {
                    q.offer(currentNode.left);
                }

                if (currentNode.right != null) {
                    q.offer(currentNode.right);
                }
            }

            depth++;
        }

        return 0;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(bfs(root));
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
