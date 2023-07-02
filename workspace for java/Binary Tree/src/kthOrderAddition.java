import java.security.PublicKey;
import java.util.*;

//Addition of all nodes at kth level
public class kthOrderAddition {

    static class Node {
        int data;
        Node leftChild;
        Node rightChild;

        Node(int data) {
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    public static class binaryTree {
        int idx = -1;

        public Node implementationBTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            int data = nodes[idx];
            Node newNode = new Node(data);
            newNode.leftChild = implementationBTree(nodes);
            newNode.rightChild = implementationBTree(nodes);

            return newNode;
        }

        //preorder traversal
        public void preorder(Node rootNode) {
            if (rootNode == null) {
                return;
            }
            System.out.print(rootNode.data + " ");
            preorder(rootNode.leftChild);
            preorder(rootNode.rightChild);
        }

        //kth level addition
        public void kthAddition(Node rootNode, int k) {
            int i = 0;
            int result = 0;
            if (rootNode == null) {
                return;
            }
            if (i == k) {
                System.out.println(rootNode.data);
                return;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(rootNode);
            queue.add(null);
            while (!queue.isEmpty()) {
                Node currentNode = queue.remove();
                if (currentNode == null) {
                    i++;
                    if (queue.isEmpty()) {
                        break;
                    } else {
                        queue.add(null);
                    }
                } else {
                    if (i == k) {
                        int data = currentNode.data;
                        while (!queue.isEmpty()){
                            Node temp = queue.remove();
                            if (temp == null){
                                System.out.println(result + data);
                                break;
                            }
                            int finalValue = temp.data;
                            result = result + finalValue;
                        }
                    }
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
        int[] nodes = {1, 2, 3, 4, -1, -1, 5, -1, -1, 6, 7, -1, -1, 8, -1, -1, 9, -1, 10, -1, -1};
        binaryTree b1 = new binaryTree();
        Node rootNode = b1.implementationBTree(nodes);
        //System.out.println(rootNode.data);
        //k is the level of the tree
        b1.kthAddition(rootNode, 3);
        //b1.preorder(rootNode);
    }
}
