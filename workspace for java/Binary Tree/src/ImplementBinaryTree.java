import java.util.*;

public class ImplementBinaryTree {

    public static class Node {
        int data;
        Node leftChild;
        Node rightChild;

        Node(int data) {
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    static class BinaryTree {
        int idx = -1;

        public Node BuildBTree(int Nodes[]) {
            idx++;
            if (Nodes[idx] == -1) {
                return null;
            }
            int data = Nodes[idx];
            Node newNode = new Node(data);

            newNode.leftChild = BuildBTree(Nodes);
            newNode.rightChild = BuildBTree(Nodes);

            return newNode;
        }

        //preOrder  traversal
        public void preOrder(Node rootNode) {
            if (rootNode == null) {
                return;
            }
            System.out.print(rootNode.data + " ");
            preOrder(rootNode.leftChild);
            preOrder(rootNode.rightChild);
        }

        //inOrder traversal
        public void inOrder(Node rootNode) {
            if (rootNode == null) {
                return;
            }
            inOrder(rootNode.leftChild);
            System.out.print(rootNode.data + " ");
            inOrder(rootNode.rightChild);
        }

        //postOrder Traversal
        public void postOrder(Node rootNode) {
            if (rootNode == null) {
                return;
            }
            postOrder(rootNode.leftChild);
            postOrder(rootNode.rightChild);
            System.out.print(rootNode.data + " ");
        }


        //Level order traversal
        public void LevelOrder(Node rootNode) {
            if (rootNode == null) {
                return;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(rootNode);
            queue.add(null);
            while (!queue.isEmpty()) {
                Node currentNode = queue.remove();
                if (currentNode == null) {
                    System.out.println();
                    if (queue.isEmpty()) {
                        break;
                    } else {
                        queue.add(null);
                    }
                } else {
                    System.out.print(currentNode.data + " ");
                    if (currentNode.leftChild != null) {
                        queue.add(currentNode.leftChild);
                    }
                    if (currentNode.rightChild != null) {
                        queue.add(currentNode.rightChild);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree binaryTree = new BinaryTree();
        Node rootNode = binaryTree.BuildBTree(nodes);
        //System.out.println(rootNode.data);

        binaryTree.preOrder(rootNode);
//        binaryTree.inOrder(rootNode);
//        binaryTree.postOrder(rootNode);
//        binaryTree.LevelOrder(rootNode);
    }
}
