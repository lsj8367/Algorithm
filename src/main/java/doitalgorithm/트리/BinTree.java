package doitalgorithm.트리;

import java.util.Comparator;

public class BinTree<K, V> {

    private Node<K, V> root; // 루트
    private Comparator<? super K> comparator = null; // 비교자

    public BinTree() {
        this.root = null;
    }

    public BinTree(final Comparator<? super K> comparator) {
        this();
        this.comparator = comparator;
    }

    private int comp(K key1, K key2) {
        if (comparator == null) {
            ((Comparable<K>) key1).compareTo(key2);
        }

        return comparator.compare(key1, key2);
    }

    public V search(K key) {
        Node<K, V> node = root;

        while (true) {
            if (node == null) {
                return null;
            }

            final int comp = comp(key, node.getKey());
            if (comp == 0) {
                return node.getData();
            } else if (comp < 0) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
    }

    public void add(K key, V data) {
        if (root == null) {
            root = new Node<>(key, data, null, null);
        } else {
            addNode(root, key, data);
        }
    }

    public void addNode(Node<K, V> node, K key, V data) {
        int comp = comp(key, node.getKey());
        if (comp == 0) {
            return;
        }

        if (comp < 0) {
            if (node.left == null) {
                node.left = new Node<>(key, data, null, null);
            } else {
                addNode(node.left, key, data);
            }
        } else {
            if (node.right == null) {
                node.right = new Node<>(key, data, null, null);
            } else {
                addNode(node.right, key, data);
            }
        }
    }

    public boolean remove(K key) {
        Node<K, V> p = root; // 스캔중인 노드
        Node<K, V> parent = null; // 스캔중인 노드의 부모 노드
        boolean isLeftChild = true; //p는 부모의 왼쪽인가

        while (true) {
            if (p == null) {
                return false;
            }

            int comp = comp(key, p.getKey());

            if (comp == 0) {
                break;
            } else {
                parent = p;
                if (comp < 0) {
                    isLeftChild = true;
                    p = p.left;
                } else {
                    isLeftChild = false;
                    p = p.right;
                }
            }
        }

        if (p.left == null) { //p 왼쪽 노드가 없음
            if (p == root) {
                root = p.right;
            } else if (isLeftChild) {
                parent.left = p.right;
            } else {
                parent.right = p.right;
            }
        } else if (p.right == null) {
            if (p == root) {
                root = p.left;
            } else if (isLeftChild) {
                parent.left = p.left;
            } else {
                parent.right = p.left;
            }
        } else {
            parent = p;
            Node<K, V> left = p.left;
            isLeftChild = true;

            while (left.right != null) { //가장 큰 노드 left를 검색
                parent = left;
                left = parent.right;
                isLeftChild = false;
            }

            p.key = left.key; //left 키값을 p로 옮김
            p.data = left.data; // left의 데이터를 p로 옮김
            if (isLeftChild) {
                parent.left = left.left; //left 삭제
            } else {
                parent.right = left.left; //left 삭제
            }
        }
        return true;
    }

    private static class Node<K, V> {
        private K key;      // 키 값
        private V data;     // 데이터
        private Node<K, V> left;  //왼쪽 자식 노드
        private Node<K, V> right; //오른쪽 자식 노드

        public Node(final K key, final V data, final Node<K, V> left, final Node<K, V> right) {
            this.key = key;
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public K getKey() {
            return key;
        }

        public V getData() {
            return data;
        }

        void print() {
            System.out.println(data);
        }

    }
}

