package 인프런.ex7;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Ex7_06 {

    private static Node root;

    private static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int level = 0;

        while (!q.isEmpty()) {
            int length = q.size();
            System.out.print(level + " : ");
            for (int i = 0; i < length; i++) {
                Node current = q.poll();
                System.out.print(current.value + " ");

                if (Objects.nonNull(current.left)) {
                    q.offer(current.left);
                }

                if (Objects.nonNull(current.right)) {
                    q.offer(current.right);
                }
            }
            level++;

            System.out.println();
        }
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        bfs(root);
    }

    private static final class Node {

        private int value;

        private Node left;
        private Node right;

        public Node(final int value) {
            this.value = value;
        }

    }

}
